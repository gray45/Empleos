package cr.ac.una.prograiv.project.domain;
// Generated 20/03/2018 10:03:47 AM by Hibernate Tools 4.3.1



/**
 * Integeroferente generated by hbm2java
 */
public class Puestooferente  implements java.io.Serializable {


     private Integer id;
     private Integer oferente;
     private Integer puesto;

    public Puestooferente() {
    }

    public Puestooferente(Integer oferente, Integer puesto) {
       this.oferente = oferente;
       this.puesto = puesto;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getOferente() {
        return this.oferente;
    }
    
    public void setOferente(Integer oferente) {
        this.oferente = oferente;
    }
    public Integer getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(Integer puesto) {
        this.puesto = puesto;
    }




}

