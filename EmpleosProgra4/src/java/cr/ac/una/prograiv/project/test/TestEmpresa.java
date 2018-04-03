/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.test;

import cr.ac.una.prograiv.project.Dao.EmpresaDao;
import cr.ac.una.prograiv.project.domain.Empresa;
import cr.ac.una.prograiv.project.domain.Usuario;
import java.util.HashSet;

/**
 *
 * @author demc0
 */
public class TestEmpresa {
    static public void main(String[] args){
       //saveEmpresa();
        //deleteEmpresa();
        mergeEmpresa(2);
    }
    
    public static void saveEmpresa() {
        for(int i =1; i<2; i++){
            Usuario u=new Usuario();
            u.setIdUsuario(3);
            Empresa usul=new Empresa(u, "nombre", "lactitud", "longitud", "email", "telefono", "descripcion", "aprobada");
            EmpresaDao bl1 = new EmpresaDao();
            bl1.save(usul);
        }
        System.out.println("Empresa guardada Correctamente");
    }
        
    
    public static void deleteEmpresa(){
        Empresa usu1 = new Empresa();
        usu1.setIdEmpresa(1);
        EmpresaDao o= new EmpresaDao();
        o.delete(usu1);        
        System.out.println("Empresa Eliimnado con exito");
    }

    public static void mergeEmpresa(Integer key) {
        EmpresaDao d=new EmpresaDao();
        Empresa del=new Empresa();
        del.setIdEmpresa(key);
        Usuario u= new Usuario();
        u.setIdUsuario(1);
        Empresa usu = new Empresa(u, "Daniel", "lactitud", "longitud", "email", "telefono", "descripcion", "aprobada");

        
        usu.setIdEmpresa(key);
        EmpresaDao bl = new EmpresaDao();
        bl.merge(usu);
        System.out.println("Empresa actualizada correctamente");
    }
    
}
