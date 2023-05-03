package MODELS;

public class Notebook extends Informaticos{
    private Double cantidadGB;

    public Notebook() {
    }

    public Notebook(String nombre, Integer stock, Double precio, String nombreFabricante, Double cantidadGB) {
        super(nombre, stock, precio, nombreFabricante);
        this.cantidadGB = cantidadGB;
    }

    public Double getCantidadGB() {
        return cantidadGB;
    }

    public void setCantidadGB(Double cantidadGB) {
        this.cantidadGB = cantidadGB;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "cantidadGB=" + cantidadGB +
                "} " + super.toString();
    }
    @Override
    public void actPrecio() {
        super.setPrecio((super.getPrecio()+(super.getPrecio()*0.20)));
    }

}