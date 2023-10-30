package logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_DUENO_PACIENTE")
    private int id_dueno_paciente;
    @Column(name="IDENTIFICACION")
    private int identificacion;
    @Column(name="NOMBRES")
    private String nombres;
    @Column(name="APELLIDOS")
    private String apellidos;
    @Column(name="DIRECCION")
    private String direccion;
    @Column(name="TELEFONO")
    private String telefono;
    @Column(name="CORREO")
    private String correo;

    public Usuario() {
    }

    public Usuario(int id_dueno_paciente, int identificacion, String nombres, String apellidos, String direccion, String telefono, String correo) {
        this.id_dueno_paciente = id_dueno_paciente;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId_dueno_paciente() {
        return id_dueno_paciente;
    }

    public void setId_dueno_paciente(int id_dueno_paciente) {
        this.id_dueno_paciente = id_dueno_paciente;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
