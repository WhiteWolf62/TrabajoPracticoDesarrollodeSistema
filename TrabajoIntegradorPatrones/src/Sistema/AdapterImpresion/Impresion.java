package Sistema.AdapterImpresion;


public class Impresion implements IAdapter{

    //atributos
    private ModuloImpresion moduloImpresion;

    //metodos
    public ModuloImpresion getModuloImpresion() {
        return moduloImpresion;
    }

    public void setModuloImpresion(ModuloImpresion moduloImpresion) {
        this.moduloImpresion = moduloImpresion;
    }

    @Override
    public void imprimir() {

    }

}
