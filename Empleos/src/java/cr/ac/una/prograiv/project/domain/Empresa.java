package cr.ac.una.prograiv.project.domain;
// Generated 31/05/2018 12:22:08 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private Integer idEmpresa;
     private Usuario usuario;
     private String nombre;
     private String lactitud;
     private String longitud;
     private String email;
     private String telefono;
     private String descripcion;
     private String aprobada;
     private String direccion;
     private Set puestos = new HashSet(0);

    public Empresa() {
    }

	
    public Empresa(Usuario usuario, String nombre, String lactitud, String longitud, String email, String telefono, String descripcion, String aprobada) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.lactitud = lactitud;
        this.longitud = longitud;
        this.email = email;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.aprobada = aprobada;
    }
    public Empresa(Usuario usuario, String nombre, String lactitud, String longitud, String email, String telefono, String descripcion, String aprobada, String direccion, Set puestos) {
       this.usuario = usuario;
       this.nombre = nombre;
       this.lactitud = lactitud;
       this.longitud = longitud;
       this.email = email;
       this.telefono = telefono;
       this.descripcion = descripcion;
       this.aprobada = aprobada;
       this.direccion = direccion;
       this.puestos = puestos;
    }
   
    public Integer getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLactitud() {
        return this.lactitud;
    }
    
    public void setLactitud(String lactitud) {
        this.lactitud = lactitud;
    }
    public String getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getAprobada() {
        return this.aprobada;
    }
    
    public void setAprobada(String aprobada) {
        this.aprobada = aprobada;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Set getPuestos() {
        return this.puestos;
    }
    
    public void setPuestos(Set puestos) {
        this.puestos = puestos;
    }




}


