/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import domain.Empresa;
import java.util.List;
import org.hibernate.HibernateException;
import utils.HibernateUtil;

/**
 *
 * @author grave
 */
public class EmpresaDao extends HibernateUtil implements IBaseDao<Empresa, Integer> {

    @Override
    public void save(Empresa obj) {
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
    public void merge(Empresa obj) {
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
    public Empresa findByID(Integer key) {
        Empresa chofer = null;

        try {
            iniciarOperacion();
            chofer = (Empresa) getSesion().get(Empresa.class, key);
        } finally {
            getSesion().close();
        }
        return chofer;
    }

    @Override
    public void delete(Empresa obj) {
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
    public List<Empresa> findAll() {
        try {
            List<Empresa> choferes;
            iniciarOperacion();
            choferes = (List<Empresa>) getSesion().createQuery("FROM Empresa").list();
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
            List<Empresa> choferes;
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
