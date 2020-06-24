package Sistema.StateHabitacion;

public class Libre implements Estado{

    //metodos
    @Override
    public void eliminarPaciente(Habitacion habitacion) {
        //nada
    }

    @Override
    public void agregarPaciente(Habitacion habitacion) {
        habitacion.setEstado(new Ocupada());
    }
}
