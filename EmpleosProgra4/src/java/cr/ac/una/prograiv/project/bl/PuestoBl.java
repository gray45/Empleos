/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.bl;

import cr.ac.una.prograiv.project.Dao.PuestoDao;
import cr.ac.una.prograiv.project.domain.Puesto;
import java.util.List;

/**
 *
 * @author grave
 */
public class PuestoBl extends BaseBl implements iBaseBl <Puesto,Integer>{

   @Override
    public void save(Puesto obj) {
        PuestoDao puesto = new PuestoDao();
        puesto.save(obj);
       // this.getDao(obj.getClass().getName()).save(obj);
    }

    @Override
    public void merge(Puesto obj) {
        PuestoDao puesto = new PuestoDao();
        puesto.save(obj);
       // this.getDao(obj.getClass().getName()).merge(obj);
    }

    
    /*public List<Puesto> findByCedula(String userName) {
        List<Puesto> drivers = findAll();
        List<Puesto> choferes = new LinkedList<>();
        for (Puesto aux : drivers) {
            if (aux.getUserName().equals(userName)) {
                choferes.add(aux);
            }
            return choferes;
        }
        return null;
    }*/
    
    @Override
    public Puesto findByID(Integer key) {
        PuestoDao puesto = new PuestoDao();
        return puesto.findByID(key);
       // return (Puesto) this.getDao("domain.Puesto").findByID(key);
    }

    @Override
    public void delete(Puesto obj) {
        PuestoDao puesto = new PuestoDao();
        puesto.delete(obj);
      //this.getDao(obj.getClass().getName()).delete(obj);         
    }

    @Override
    public List<Puesto> findAll() {
        PuestoDao puesto = new PuestoDao();
        return puesto.findAll();
        //return this.getDao("domain.Puesto").findAll();
    }

    @Override
    public List<Puesto> findByQuery(String query) {
        PuestoDao puesto = new PuestoDao();
        return puesto.findByQuery(query);
        //return this.getDao("domain.Puesto").findByQuery(query);
    }
    
    @Override
    public List<Puesto> findByQueryLimit(String query, int limit) {
        PuestoDao puesto = new PuestoDao();
        return puesto.findByQueryLimit(query, limit);
        //return this.getDao("domain.Puesto").findByQuery(query);
    }
    
    @Override
    public List findHQLQuery(String query) {
        PuestoDao puesto = new PuestoDao();
        return puesto.findHQLQuery(query);
        //return this.getDao("domain.Puesto").findHQLQuery(query);
    }
}
