package domain;
// Generated 20/03/2018 10:03:47 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Carateristicas generated by hbm2java
 */
public class Carateristicas  implements java.io.Serializable {


     private Integer idCarateristicas;
     private String descripcion;
     private String grado;
     private Set carateristicasoferentes = new HashSet(0);
     private Set carateristicaspuestos = new HashSet(0);

    public Carateristicas() {
    }

	
    public Carateristicas(String descripcion, String grado) {
        this.descripcion = descripcion;
        this.grado = grado;
    }
    public Carateristicas(String descripcion, String grado, Set carateristicasoferentes, Set carateristicaspuestos) {
       this.descripcion = descripcion;
       this.grado = grado;
       this.carateristicasoferentes = carateristicasoferentes;
       this.carateristicaspuestos = carateristicaspuestos;
    }
   
    public Integer getIdCarateristicas() {
        return this.idCarateristicas;
    }
    
    public void setIdCarateristicas(Integer idCarateristicas) {
        this.idCarateristicas = idCarateristicas;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getGrado() {
        return this.grado;
    }
    
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public Set getCarateristicasoferentes() {
        return this.carateristicasoferentes;
    }
    
    public void setCarateristicasoferentes(Set carateristicasoferentes) {
        this.carateristicasoferentes = carateristicasoferentes;
    }
    public Set getCarateristicaspuestos() {
        return this.carateristicaspuestos;
    }
    
    public void setCarateristicaspuestos(Set carateristicaspuestos) {
        this.carateristicaspuestos = carateristicaspuestos;
    }




}


