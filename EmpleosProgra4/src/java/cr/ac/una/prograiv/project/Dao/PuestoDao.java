/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.Dao;

import cr.ac.una.prograiv.project.domain.Puesto;
import cr.ac.una.prograiv.project.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author demc0
 */
public class PuestoDao extends HibernateUtil implements IBaseDao<Puesto, Integer> {

    @Override
    public void save(Puesto obj) {
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
    public void merge(Puesto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Puesto findByID(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Puesto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Puesto> findAll() {
       try {
            List<Puesto> choferes;
            iniciarOperacion();
            choferes = (List<Puesto>) getSesion().createQuery("FROM Puesto").list();
            return choferes;
        } catch (HibernateException he) {
            manejarException(he);
            throw he;
        } finally {
            getSesion().close();
        }}

    @Override
    public List<Puesto> findByQuery(String query) {
        try {
            List<Puesto> puestos;
            iniciarOperacion();
            puestos =  getSesion().createQuery(query).list();
            return puestos;
        } catch (HibernateException he) {
            manejarException(he);
            throw he;
        } finally {
            getSesion().close();
        }}
    
    @Override
    public List<Puesto> findByQueryLimit(String query, int limit ) {
        try {
            List<Puesto> puestos;
            iniciarOperacion();
            puestos =  getSesion().createQuery(query).setMaxResults(limit).list();
            return puestos;
        } catch (HibernateException he) {
            manejarException(he);
            throw he;
        } finally {
            getSesion().close();
        }}

    @Override
    public List findHQLQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
