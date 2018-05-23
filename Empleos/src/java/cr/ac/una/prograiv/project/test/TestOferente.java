/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.test;

import cr.ac.una.prograiv.project.Dao.OferenteDao;

import cr.ac.una.prograiv.project.domain.Oferente;
import cr.ac.una.prograiv.project.domain.Usuario;

/**
 *
 * @author demc0
 */
public class TestOferente {
    static public void main(String[] args){
        saveOferente();
        //deleteOferente();
        //mergeOferente(2);
    }
    
    public static void saveOferente() {
        for(int i =1; i<2; i++){
            Usuario u=new Usuario();
            u.setIdUsuario(3);
            Oferente usu1 = new Oferente(u,"114730950","Daniel","Mora","Costarricense","83327258","nojoda","123","321",1);
            OferenteDao bl1 = new OferenteDao();
            bl1.save(usu1);
            System.out.println("Oferente "+usu1.getNombre()+" Guardado con exito");
        }
        
    }
        
    
    public static void deleteOferente(){
        Oferente usu1 = new Oferente();
        usu1.setIdOferente(1);
        OferenteDao o= new OferenteDao();
        o.delete(usu1);        
        System.out.println("Oferente Eliimnado con exito");
    }

    public static void mergeOferente(Integer key) {
        OferenteDao d=new OferenteDao();
        Oferente del=new Oferente();
        del.setIdOferente(key);
        Usuario u= new Usuario();
        u.setIdUsuario(1);
        Oferente usu = new Oferente(u,"11","Daniel","Mora","Costarricense","83327258","nojoda","123","321",1);
        usu.setIdOferente(key);
        OferenteDao bl = new OferenteDao();
        bl.merge(usu);
        System.out.println("Oferente numero "+key+" Correctamente actualizado");
    }
    
}

