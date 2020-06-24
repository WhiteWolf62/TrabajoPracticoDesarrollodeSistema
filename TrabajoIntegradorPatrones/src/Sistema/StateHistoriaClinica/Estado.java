package Sistema.StateHistoriaClinica;

public interface Estado {

    //metodos
    public void fallece(HistoriaClinica historiaClinica);
    public void activar(HistoriaClinica historiaClinica);
    public void internar(HistoriaClinica historiaClinica);
}
