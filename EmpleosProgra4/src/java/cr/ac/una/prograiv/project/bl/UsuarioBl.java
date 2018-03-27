/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.bl;

import cr.ac.una.prograiv.project.domain.Usuario;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author grave
 */
public class UsuarioBl extends BaseBl implements iBaseBl <Usuario,Integer>{

    @Override
    public void save(Usuario obj) {
        this.getDAO( obj.getClass().getName()).save(obj);
    }

    @Override
    public void merge(Usuario obj) {
        this.getDAO(obj.getClass().getName()).merge(obj);
    }

    
    public List<Usuario> findByCedula(String userName) {
        List<Usuario> drivers = findAll();
        List<Usuario> choferes = new LinkedList<>();
        for (Usuario aux : drivers) {
            if (aux.getUserName().equals(userName)) {
                choferes.add(aux);
            }
            return choferes;
        }
        return null;
    }
    
    @Override
    public Usuario findByID(Integer key) {
        return (Usuario) this.getDAO("domain.Usuario").findByID(key);
    }

    @Override
    public void delete(Usuario obj) {
      this.getDAO(obj.getClass().getName()).delete(obj);         
    }

    @Override
    public List<Usuario> findAll() {
        return this.getDAO("domain.Usuario").findAll();
    }

    @Override
    public List<Usuario> findByQuery(String query) {
        return this.getDAO("domain.Usuario").findByQuery(query);
    }
    
    @Override
    public List findHQLQuery(String query) {
        return this.getDAO("domain.Usuario").findHQLQuery(query);
    }
}