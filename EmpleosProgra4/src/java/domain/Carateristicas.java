package domain;
// Generated 20/03/2018 10:03:47 AM by Hibernate Tools 4.3.1


/**
 * Carateristicas generated by hbm2java
 */
public class Carateristicas  implements java.io.Serializable {


     private Integer idCarateristicas;
     private String descripcion;
     private String grado;
    
    public Carateristicas() {
    }

	
    public Carateristicas(String descripcion, String grado) {
        this.descripcion = descripcion;
        this.grado = grado;
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


}


