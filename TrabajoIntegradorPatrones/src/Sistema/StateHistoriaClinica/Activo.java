package Sistema.StateHistoriaClinica;

public class Activo implements Estado{

    //metodos
    @Override
    public void fallece(HistoriaClinica historiaClinica) {
        historiaClinica.setEstado(new Fallecido());
    }

    @Override
    public void activar(HistoriaClinica historiaClinica) {
        //nada
    }

    @Override
    public void internar(HistoriaClinica historiaClinica) {
        historiaClinica.setEstado(new Internado());
    }
}
