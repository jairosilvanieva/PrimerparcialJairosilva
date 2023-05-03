package MODELS;

public class Escritorio extends Producto{
    private Double alto;
    private Double ancho;

    public Escritorio() {
    }

    public Escritorio(String nombre, Integer stock, Double precio, Double alto, Double ancho) {
        super(nombre, stock, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                "} " + super.toString();
    }

    @Override
    public void actPrecio() {
        super.setPrecio((super.getPrecio()+(super.getPrecio()*0.10)));
    }
}