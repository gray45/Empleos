/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.bl;

import cr.ac.una.prograiv.project.Dao.EmpresaDao;
import cr.ac.una.prograiv.project.Dao.IBaseDao;
import cr.ac.una.prograiv.project.Dao.OferenteDao;
import cr.ac.una.prograiv.project.Dao.UsuarioDao;
import java.util.LinkedHashMap;

/**
 *
 * @author grave
 */
public class BaseBl {

    private final LinkedHashMap<String, IBaseDao> daos;

    public BaseBl() {
        daos = new LinkedHashMap();
        daos.put("cr.ac.una.prograiv.project.Dao.Usuario", new UsuarioDao());
        daos.put("cr.ac.una.prograiv.project.Dao.Empresa", new EmpresaDao());
        daos.put("cr.ac.una.prograiv.project.Dao.Oferente", new OferenteDao());
    }

    /**
     *
     * @param className
     * @return
     */
    public IBaseDao getDao(String className) {
        return daos.get(className);
    }
}
