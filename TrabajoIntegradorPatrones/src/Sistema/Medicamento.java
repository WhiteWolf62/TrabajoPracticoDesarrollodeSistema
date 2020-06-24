package Sistema;

public class Medicamento {

    //atributos
    private String nombre;
    private double dosis;
    private String freceuncia;
    private String indicacionesEspeciales;

    //contrusctor
    public Medicamento(String nombre, double dosis, String freceuncia, String indicacionesEspeciales) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.freceuncia = freceuncia;
        this.indicacionesEspeciales = indicacionesEspeciales;
    }

    //metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }

    public String getFreceuncia() {
        return freceuncia;
    }

    public void setFreceuncia(String freceuncia) {
        this.freceuncia = freceuncia;
    }

    public String getIndicacionesEspeciales() {
        return indicacionesEspeciales;
    }

    public void setIndicacionesEspeciales(String indicacionesEspeciales) {
        this.indicacionesEspeciales = indicacionesEspeciales;
    }
}
