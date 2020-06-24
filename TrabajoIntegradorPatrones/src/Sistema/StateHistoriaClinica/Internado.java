package Sistema.StateHistoriaClinica;

public class Internado implements Estado{


    //metodos
    @Override
    public void fallece(HistoriaClinica historiaClinica) {
        historiaClinica.setEstado(new Fallecido());
    }

    @Override
    public void activar(HistoriaClinica historiaClinica) {
        historiaClinica.setEstado(new Activo());
    }

    @Override
    public void internar(HistoriaClinica historiaClinica) {
        //nada
    }
}
