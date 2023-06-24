
package lab10p2_fernandopadilla;


public class DiscoDuro extends Parte {

    private String tamaño, marca;

    public DiscoDuro() {
    }

    public DiscoDuro(String tamaño, String marca, int tiempo) {
        super(tiempo);
        this.tamaño = tamaño;
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "tamaño=" + tamaño + ",marca=" + marca;
    }    
}
