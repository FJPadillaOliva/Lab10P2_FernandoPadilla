package lab10p2_fernandopadilla;

class Bateria extends Parte {
    private int capacidadHoras;
    private String material;

    public Bateria() {
    }

    public Bateria(int capacidadHoras, String material, int tiempo) {
        super(tiempo);
        this.capacidadHoras = capacidadHoras;
        this.material = material;
    }

    public int getCapacidadHoras() {
        return capacidadHoras;
    }

    public void setCapacidadHoras(int capacidadHoras) {
        this.capacidadHoras = capacidadHoras;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "CapacidadH=" + capacidadHoras + ",material=" + material;
    }
    
    
}
