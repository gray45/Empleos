/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.test;

import cr.ac.una.prograiv.project.Dao.PuestoDao;
import cr.ac.una.prograiv.project.bl.PuestoBl;
import cr.ac.una.prograiv.project.domain.Empresa;
import cr.ac.una.prograiv.project.domain.Puesto;
import java.util.List;

/**
 *
 * @author demc0
 */
public class TestPuesto {
    public static void main(String[] args) {
        savepuesto();
       // mergeUsuario(3);
        //deleteUsuario();
      // findAllUsuario();
        //findIdUsuario(17);
        //findByName("gray");
  //      findquery();
        //findquery("gray","12345");

    }
    
    public static void savepuesto(){
        PuestoBl puestobl = new PuestoBl();
        for(int i=0; i<6; i++){
            Empresa empresa = new Empresa();
            empresa.setIdEmpresa(20);
        puestobl.save(new Puesto(empresa,"programador", "1200 000", "tele-trabajo", 2));
        }
}
    
    public static void findquery(){
        PuestoBl puestoBl =new PuestoBl();
         List<Puesto> puestos;
        String query="FROM Puesto where Empresa_idEmpresa='2'";
        //String query="FROM puesto as p, carateristicaspuesto as cp, carateristicas as c\n" +
          //          "WHERE p.idPuesto=c.Puesto_idPuesto\n" +
            //        "and cp.Carateristicas_idCarateristicas=c.idCarateristicas\n" +
              //      "AND c.idCarateristicas= "+car;
        puestos= puestoBl.findByQueryLimit(query, 5);
       
        
             puestos.forEach((aux) -> {
            System.out.println(aux.getDescripcion());
        });
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
