/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.bl;

import cr.ac.una.prograiv.project.Dao.CaracteristicasDao;
import cr.ac.una.prograiv.project.domain.Carateristicas;
import java.util.List;

/**
 *
 * @author grave
 */
public class CaracteristicasBl extends BaseBl implements iBaseBl <Carateristicas,Integer>{

   @Override
    public void save(Carateristicas obj) {
        CaracteristicasDao usu = new CaracteristicasDao();
        usu.save(obj);
       // this.getDao(obj.getClass().getName()).save(obj);
    }

    @Override
    public void merge(Carateristicas obj) {
        CaracteristicasDao usu = new CaracteristicasDao();
        usu.save(obj);
       // this.getDao(obj.getClass().getName()).merge(obj);
    }

    
    /*public List<Carateristicas> findByCedula(String userName) {
        List<Carateristicas> drivers = findAll();
        List<Carateristicas> choferes = new LinkedList<>();
        for (Carateristicas aux : drivers) {
            if (aux.getUserName().equals(userName)) {
                choferes.add(aux);
            }
            return choferes;
        }
        return null;
    }*/
    
    @Override
    public Carateristicas findByID(Integer key) {
        CaracteristicasDao usu = new CaracteristicasDao();
        return usu.findByID(key);
       // return (Carateristicas) this.getDao("domain.Carateristicas").findByID(key);
    }

    @Override
    public void delete(Carateristicas obj) {
        CaracteristicasDao usu = new CaracteristicasDao();
        usu.delete(obj);
      //this.getDao(obj.getClass().getName()).delete(obj);         
    }

    @Override
    public List<Carateristicas> findAll() {
        CaracteristicasDao usu = new CaracteristicasDao();
        return usu.findAll();
        //return this.getDao("domain.Carateristicas").findAll();
    }

    @Override
    public List<Carateristicas> findByQuery(String query) {
        CaracteristicasDao usu = new CaracteristicasDao();
        return usu.findByQuery(query);
        //return this.getDao("domain.Carateristicas").findByQuery(query);
    }
    
    @Override
    public List<Carateristicas> findByQueryLimit(String query, int limit) {
        CaracteristicasDao usu = new CaracteristicasDao();
        return usu.findByQueryLimit(query, limit);
        //return this.getDao("domain.Carateristicas").findByQuery(query);
    }
    
    @Override
    public List findHQLQuery(String query) {
        CaracteristicasDao usu = new CaracteristicasDao();
        return usu.findHQLQuery(query);
        //return this.getDao("domain.Carateristicas").findHQLQuery(query);
    }
}
