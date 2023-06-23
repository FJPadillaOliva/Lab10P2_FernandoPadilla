
package lab10p2_fernandopadilla;


public class Tecnico {
    private String nombre;
    private int edad;
    private String genero;
    private int ensambles;

    public Tecnico() {
    }

    public Tecnico(String nombre, int edad, String genero, int ensambles) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ensambles = ensambles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEnsambles() {
        return ensambles;
    }

    public void setEnsambles(int ensambles) {
        this.ensambles = ensambles;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", ensambles=" + ensambles + '}';
    }
    
}
