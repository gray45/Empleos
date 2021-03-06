/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.Dao;

import cr.ac.una.prograiv.project.domain.Oferente;
import java.util.List;
import org.hibernate.HibernateException;
import cr.ac.una.prograiv.project.utils.HibernateUtil;

/**
 *
 * @author grave
 */
public class OferenteDao extends HibernateUtil implements IBaseDao<Oferente, Integer> {

   @Override
    public void save(Oferente obj) {
        try {
            iniciarOperacion();
            getSesion().save(obj);
            getTransac().commit();
        } catch (HibernateException he) {
            manejarException(he);
            throw he;
        } finally {
            getSesion().close();
        }

    }

    @Override
    public void merge(Oferente obj) {
        try {
            iniciarOperacion();
            getSesion().merge(obj);
            getTransac().commit();
        } catch (HibernateException he) {
            manejarException(he);
            throw he;
        } finally {
            getSesion().close();
        }
    }

    @Override
    public Oferente findByID(Integer key) {
        Oferente oferente = null;

        try {
            iniciarOperacion();
            oferente = (Oferente) getSesion().get(Oferente.class, key);
        } finally {
            getSesion().close();
        }
        return oferente;
    }

    @Override
    public void delete(Oferente obj) {
        try {
            iniciarOperacion();
            getSesion().delete(obj);
            getTransac().commit();
        } catch (HibernateException he) {
            manejarException(he);
            throw he;
        } finally {
            getSesion().close();
        }

    }

    @Override
    public List<Oferente> findAll() {
        try {
            List<Oferente> choferes;
            iniciarOperacion();
            choferes = (List<Oferente>) getSesion().createQuery("FROM Oferente").list();
            return choferes;
        } catch (HibernateException he) {
            manejarException(he);
            throw he;
        } finally {
            getSesion().close();
        }
    }

    @Override
    public List findByQuery(String query) {
        try {
            List<Oferente> choferes;
            iniciarOperacion();
            choferes =  getSesion().createQuery(query).list();
            return choferes;
        } catch (HibernateException he) {
            manejarException(he);
            throw he;
        } finally {
            getSesion().close();
        }
    }
    
    @Override
    public List<Oferente> findByQueryLimit(String query, int limit ) {
        try {
            List<Oferente> oferentes;
            iniciarOperacion();
            oferentes =  getSesion().createQuery(query).setMaxResults(limit).list();
            return oferentes;
        } catch (HibernateException he) {
            manejarException(he);
            throw he;
        } finally {
            getSesion().close();
        }}

    @Override
    public List findHQLQuery(String query) {
        List lista=null;
        try{
            iniciarOperacion();
            lista = getSesion().createQuery(query).list();
            return lista;
        }catch(HibernateException he){
            manejarException(he);
            throw he;
        }finally{
            getSesion().close();
        }
        
    }

}
