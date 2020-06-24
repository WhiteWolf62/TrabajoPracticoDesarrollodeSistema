package Sistema.StateHabitacion;

import Sistema.Paciente;

public class Habitacion {

    //atributos
    private Paciente paciente;
    private Estado estado;

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

    public void cambiarEstado(Estado nuevo){
        this.setEstado(nuevo);
    }

}
