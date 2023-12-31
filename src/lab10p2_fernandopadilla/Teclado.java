
package lab10p2_fernandopadilla;


public class Teclado extends Parte {
private String material, color;

    public Teclado() {
    }

    public Teclado(String material, String color, int tiempo) {
        super(tiempo);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Material=" + material + ",color=" + color;
    }


}
