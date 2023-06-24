package lab10p2_fernandopadilla;


public class Pantalla extends Parte {
    private boolean tactil;
    private String tipo;

    public Pantalla() {
    }

    public Pantalla(boolean tactil, String tipo, int tiempo) {
        super(tiempo);
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public boolean isTactil() {
        return tactil;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tactil=" + tactil + ",tipo=" + tipo;
    }
    
    
    
}
