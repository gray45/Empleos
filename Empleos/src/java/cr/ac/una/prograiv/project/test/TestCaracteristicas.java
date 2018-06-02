/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.test;

import cr.ac.una.prograiv.project.Dao.CaracteristicasDao;
import cr.ac.una.prograiv.project.bl.CaracteristicasBl;
import cr.ac.una.prograiv.project.domain.Carateristicas;
import java.util.List;


/**
 *
 * @author grave
 */
public class TestCaracteristicas {
     static public void main(String[] args){
       todas();
    }
     
     public static void todas(){
List<Carateristicas> usuarios;
        CaracteristicasBl bl = new CaracteristicasBl();
        usuarios = bl.findAll();
        // usuarios = bl.findAll();
        usuarios.forEach((aux) -> {
            System.out.println(aux.getDescripcion());
        });
}
}
