/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.bl;

import cr.ac.una.prograiv.project.Dao.OferenteDao;
import cr.ac.una.prograiv.project.domain.Oferente;
import java.util.List;

/**
 *
 * @author grave
 */
public class OferenteBl extends BaseBl implements iBaseBl <Oferente,Integer>{

   @Override
    public void save(Oferente obj) {
        OferenteDao oferente = new OferenteDao();
        oferente.save(obj);
       // this.getDao(obj.getClass().getName()).save(obj);
    }

    @Override
    public void merge(Oferente obj) {
        OferenteDao oferente = new OferenteDao();
        oferente.save(obj);
       // this.getDao(obj.getClass().getName()).merge(obj);
    }

    @Override
    public Oferente findByID(Integer key) {
        OferenteDao oferente = new OferenteDao();
        return oferente.findByID(key);
       // return (Oferente) this.getDao("domain.Oferente").findByID(key);
    }

    @Override
    public void delete(Oferente obj) {
        OferenteDao oferente = new OferenteDao();
        oferente.delete(obj);
      //this.getDao(obj.getClass().getName()).delete(obj);         
    }

    @Override
    public List<Oferente> findAll() {
        OferenteDao oferente = new OferenteDao();
        return oferente.findAll();
        //return this.getDao("domain.Oferente").findAll();
    }

    @Override
    public List<Oferente> findByQuery(String query) {
        OferenteDao oferente = new OferenteDao();
        return oferente.findByQuery(query);
        //return this.getDao("domain.Oferente").findByQuery(query);
    }
    
    @Override
    public List<Oferente> findByQueryLimit(String query, int limit) {
        OferenteDao oferente = new OferenteDao();
        return oferente.findByQueryLimit(query, limit);
        //return this.getDao("domain.Oferente").findByQuery(query);
    }
    
    @Override
    public List findHQLQuery(String query) {
        OferenteDao oferente = new OferenteDao();
        return oferente.findHQLQuery(query);
        //return this.getDao("domain.Oferente").findHQLQuery(query);
    }
}
