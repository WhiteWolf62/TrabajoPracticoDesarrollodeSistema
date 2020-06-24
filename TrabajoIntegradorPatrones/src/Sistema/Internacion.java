package Sistema;

import java.util.Date;
import java.util.HashMap;

public class Internacion {

    //atributos
    private Medico medico;
    private HashMap <String, Medicamento> indicaciones;
    private Date ingreso;
    private HashMap<Medico, Date> alta;

    //constructor
    public Internacion(Medico medico, HashMap<String, Medicamento> indicaciones, Date ingreso, HashMap<Medico, Date> alta) {
        this.medico = medico;
        this.indicaciones = indicaciones;
        this.ingreso = ingreso;
        this.alta = alta;
    }

    //metodo
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public HashMap<String, Medicamento> getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(HashMap<String, Medicamento> indicaciones) {
        this.indicaciones = indicaciones;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public HashMap<Medico, Date> getAlta() {
        return alta;
    }

    public void setAlta(HashMap<Medico, Date> alta) {
        this.alta = alta;
    }
}
