/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.test;

import cr.ac.una.prograiv.project.Dao.PuestoDao;
import cr.ac.una.prograiv.project.domain.Puesto;
import java.util.List;

/**
 *
 * @author demc0
 */
public class TestPuesto {
    public static void main(String[] args) {
        //saveUsuario();
       // mergeUsuario(3);
        //deleteUsuario();
       findAllUsuario();
        //findIdUsuario(17);
        //findByName("gray");
        //findquery("1");
        //findquery("gray","12345");

    }
    public static void findquery(String car ){
        PuestoDao dao=new PuestoDao();
        Puesto puestos;
        String query="FROM puesto";
        //String query="FROM puesto as p, carateristicaspuesto as cp, carateristicas as c\n" +
          //          "WHERE p.idPuesto=c.Puesto_idPuesto\n" +
            //        "and cp.Carateristicas_idCarateristicas=c.idCarateristicas\n" +
              //      "AND c.idCarateristicas= "+car;
        puestos=(Puesto)dao.findAll();
       
        
            System.out.println(puestos.getDescripcion());
        }
        
        public static void findAllUsuario() {
        List<Puesto> usuarios;
        PuestoDao bl = new PuestoDao();
        usuarios = bl.findAll();
        // usuarios = bl.findAll();
        usuarios.forEach((aux) -> {
            System.out.println(aux.getDescripcion());
        });
    }
        
        
        
    
}
