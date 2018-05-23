/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.bl;

import cr.ac.una.prograiv.project.Dao.EmpresaDao;
import cr.ac.una.prograiv.project.domain.Empresa;
import java.util.List;

/**
 *
 * @author grave
 */
public class EmpresaBl extends BaseBl implements iBaseBl <Empresa,Integer>{

   @Override
    public void save(Empresa obj) {
        EmpresaDao empresa = new EmpresaDao();
        empresa.save(obj);
       // this.getDao(obj.getClass().getName()).save(obj);
    }

    @Override
    public void merge(Empresa obj) {
        EmpresaDao empresa = new EmpresaDao();
        empresa.save(obj);
       // this.getDao(obj.getClass().getName()).merge(obj);
    }

    
    /*public List<Empresa> findByCedula(String userName) {
        List<Empresa> drivers = findAll();
        List<Empresa> choferes = new LinkedList<>();
        for (Empresa aux : drivers) {
            if (aux.getUserName().equals(userName)) {
                choferes.add(aux);
            }
            return choferes;
        }
        return null;
    }*/
    
    @Override
    public Empresa findByID(Integer key) {
        EmpresaDao empresa = new EmpresaDao();
        return empresa.findByID(key);
       // return (Empresa) this.getDao("domain.Empresa").findByID(key);
    }

    @Override
    public void delete(Empresa obj) {
        EmpresaDao empresa = new EmpresaDao();
        empresa.delete(obj);
      //this.getDao(obj.getClass().getName()).delete(obj);         
    }

    @Override
    public List<Empresa> findAll() {
        EmpresaDao empresa = new EmpresaDao();
        return empresa.findAll();
        //return this.getDao("domain.Empresa").findAll();
    }

    @Override
    public List<Empresa> findByQuery(String query) {
        EmpresaDao empresa = new EmpresaDao();
        return empresa.findByQuery(query);
        //return this.getDao("domain.Empresa").findByQuery(query);
    }
    
    @Override
    public List<Empresa> findByQueryLimit(String query, int limit) {
        EmpresaDao empresa = new EmpresaDao();
        return empresa.findByQueryLimit(query, limit);
        //return this.getDao("domain.Empresa").findByQuery(query);
    }
    
    @Override
    public List findHQLQuery(String query) {
        EmpresaDao empresa = new EmpresaDao();
        return empresa.findHQLQuery(query);
        //return this.getDao("domain.Empresa").findHQLQuery(query);
    }
}
