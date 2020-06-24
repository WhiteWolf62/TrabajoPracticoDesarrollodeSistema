package Sistema;

import org.omg.PortableInterceptor.ObjectReferenceFactory;

public class ObraSocial {

    //atributos
    private int numeroCarnet;
    private String plan;
    private String institucion;

    //constructor
    public ObraSocial(int numeroCarnet, String plan, String institucion){
        numeroCarnet = numeroCarnet;
        plan = plan;
        institucion = institucion;
    }

    //metodos
    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
}
