package Sistema;

public class Medico {

    //atributo
    private int matricula;
    private String apellido;
    private String nombre;
    private String especialidad;

    //constructor
    public Medico(int matricula, String apellido, String nombre, String especialidad) {
        this.matricula = matricula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    //metodos
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
