package Sistema.StateHabitacion;

public class Ocupada implements Estado{

    //metodos
    @Override
    public void eliminarPaciente(Habitacion habitacion) {
        habitacion.setPaciente(null);
        habitacion.setEstado(new Libre());
    }

    @Override
    public void agregarPaciente(Habitacion habitacion) {
        //nada
    }
}
