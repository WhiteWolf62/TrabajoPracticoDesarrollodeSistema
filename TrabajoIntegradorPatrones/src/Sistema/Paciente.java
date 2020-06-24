package Sistema;

import java.util.Date;

public class Paciente {

    //atributos
    private String apellido;
    private String nombre;
    private String tipoDocumento;
    private int numeroDocumento;
    private Date nacimiento;
    private String domicilio;
    private int telefono;
    private String mail;
    private ObraSocial obraSocial;

    //constructor
    public Paciente(String apellido, String nombre, String tipoDocumento, int numeroDocumento, Date nacimiento, String domicilio, int telefono, String mail, ObraSocial obraSocial) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nacimiento = nacimiento;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
        this.obraSocial = obraSocial;
    }

    //metodos
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }

}
