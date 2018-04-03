/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.test;

import cr.ac.una.prograiv.project.Dao.UsuarioDao;
import cr.ac.una.prograiv.project.bl.UsuarioBl;
import cr.ac.una.prograiv.project.domain.Usuario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author grave
 */
public class TestUsuario {

    public static void main(String[] args) {
        //saveUsuario();
        mergeUsuario(3);
        //deleteUsuario();
        //findAllUsuario();
        //findIdUsuario(17);
        //findByName("gray");
        //findNombre("gray");

    }

    public static void saveUsuario() {
        for(int i =1; i<2; i++){
        Usuario usu1 = new Usuario("gray", "12345","1");
        UsuarioBl bl1 = new UsuarioBl();
        bl1.save(usu1);
    }
        
       /* Usuario usu2 = new Usuario("jjf", "123","123","Oscar", "Carmona", "Mora", "Nadie@gmail.com", new Date(), "8888888","Dirección",1, new Date(), "Nadie");
        UsuarioBl bl2= new UsuarioBl();
        bl2.save(usu2);
        
        Usuario usu3 = new Usuario("ujjuh", "123","123","Oscar", "Carmona", "Mora", "Nadie@gmail.com", new Date(), "8888888","Dirección",1, new Date(), "Nadie");
        UsuarioBl bl3 = new UsuarioBl();
        bl3.save(usu3);
        
        Usuario usu4 = new Usuario("yjjw", "123","123","Oscar", "Carmona", "Mora", "Nadie@gmail.com", new Date(), "8888888","Dirección",1, new Date(), "Nadie");
        UsuarioBl bl4 = new UsuarioBl();
        bl4.save(usu4);*/
        
        System.out.println("Usuario guardado con exito");
    }

    public static void deleteUsuario() {
        Usuario usu1 = new Usuario();
        usu1.setIdUsuario(4);
        UsuarioDao o= new UsuarioDao();
        o.delete(usu1);        
        System.out.println("Usuario Eliimnado con exito");

        

    }

    public static void findAllUsuario() {
        List<Usuario> usuarios;
        UsuarioDao bl = new UsuarioDao();
        usuarios = bl.findAll();
        // usuarios = bl.findAll();
        usuarios.forEach((aux) -> {
            System.out.println(aux.getUserName());
        });
    }

    public static void mergeUsuario(Integer key) {
        UsuarioDao d=new UsuarioDao();
        Usuario del=new Usuario();
        del.setIdUsuario(key);
        Usuario usu = new Usuario("Daniel","123","123");
        usu.setIdUsuario(key);
        UsuarioDao bl = new UsuarioDao();
        bl.merge(usu);
    }
/*
    public static void findIdUsuario(Integer key) {
        UsuarioBl bl = new UsuarioBl();
        Usuario u;
        u = bl.findByID(key);
        System.out.println(u.getNombre());

    }
    
    public static void findByName(String name){
        UsuarioDao bl = new UsuarioDao();
        Usuario u;
        u = bl.findByName(name);
        System.out.println(u.getPkIdUsuario());
    }
    */
    public static void findNombre(String key) {
        UsuarioDao bl = new UsuarioDao();
        List<Usuario> c;
        c = bl.findByQuery("Select * FROM usuario WHERE userName= " + " ' " + key + " ';");
        System.out.println(c.size());
    }
}
