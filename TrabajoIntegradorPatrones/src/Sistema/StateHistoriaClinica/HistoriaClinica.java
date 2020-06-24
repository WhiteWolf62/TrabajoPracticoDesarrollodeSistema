package Sistema.StateHistoriaClinica;

import Sistema.Internacion;
import Sistema.Paciente;

import java.util.ArrayList;

public class HistoriaClinica {

    //atributos
    private Paciente paciente;
    private ArrayList<Internacion> internaciones;
    private Estado estado;

    //constructor
    public HistoriaClinica(Paciente paciente, ArrayList<Internacion> internaciones) {
        this.paciente = paciente;
        this.internaciones = internaciones;
    }

    //metodos
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Internacion> getInternaciones() {
        return internaciones;
    }

    public void setInternaciones(ArrayList<Internacion> internaciones) {
        this.internaciones = internaciones;
    }

    public void agregarInternacion(Internacion nueva){
        this.getInternaciones().add(nueva);
    }

}
