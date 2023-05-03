package MODELS;

public abstract class Informaticos extends Producto{

    private String nombreFabricante;

    public Informaticos() {
    }

    public Informaticos(String nombre, Integer stock, Double precio, String nombreFabricante) {
        super(nombre, stock, precio);
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "Informaticos{" +
                "nombreFabricante='" + nombreFabricante + '\'' +
                "} " + super.toString();
    }


}