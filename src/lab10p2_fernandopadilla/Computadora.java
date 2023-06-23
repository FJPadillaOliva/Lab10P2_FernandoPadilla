
package lab10p2_fernandopadilla;


public class Computadora {
    private String num_serie,año,color,material;
    private Parte partes;

    public Computadora() {
    }

    public Computadora(String num_serie, String año, String color, String material, Parte partes) {
        this.num_serie = num_serie;
        this.año = año;
        this.color = color;
        this.material = material;
        this.partes = partes;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Parte getPartes() {
        return partes;
    }

    public void setPartes(Parte partes) {
        this.partes = partes;
    }

    @Override
    public String toString() {
        return "Computadora{" + "num_serie=" + num_serie + ", a\u00f1o=" + año + ", color=" + color + ", material=" + material + ", partes=" + partes + '}';
    }
    
    
}
