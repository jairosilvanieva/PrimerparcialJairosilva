package MODELS;

public class Sillas extends Producto implements Beneficio {
    private Boolean tieneRuedas;

    public Sillas() {
    }

    public Sillas(String nombre, Integer stock, Double precio, Boolean tieneRuedas) {
        super(nombre, stock, precio);
        this.tieneRuedas = tieneRuedas;
    }

    public Boolean getTieneRuedas() {
        return tieneRuedas;
    }

    public void setTieneRuedas(Boolean tieneRuedas) {
        this.tieneRuedas = tieneRuedas;
    }

    @Override
    public String toString() {
        return "Sillas{" +
                "tieneRuedas=" + tieneRuedas +
                "} " + super.toString();
    }

    @Override
    public void descuento(Double descuento) {
        setPrecio((getPrecio()* (100 - descuento))/100);
    }

    @Override
    public void actPrecio() {
        super.setPrecio((super.getPrecio()+(super.getPrecio()*0.05)));
    }
}