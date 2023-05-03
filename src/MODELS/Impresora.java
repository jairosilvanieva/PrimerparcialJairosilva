package MODELS;

public class Impresora extends Informaticos implements Beneficio{

    private Integer impresionesXMin ;

    public Impresora() {
    }

    public Impresora(String nombre, Integer stock, Double precio, String nombreFabricante, Integer impresionesXMin) {
        super(nombre, stock, precio, nombreFabricante);
        this.impresionesXMin = impresionesXMin;
    }

    public Integer getImpresionesXMin() {
        return impresionesXMin;
    }

    public void setImpresionesXMin(Integer impresionesXMin) {
        this.impresionesXMin = impresionesXMin;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "impresionesXMin=" + impresionesXMin +
                "} " + super.toString();
    }

    @Override
    public void actPrecio() {
        super.setPrecio((super.getPrecio()+(super.getPrecio()*0.15)));
    }


    @Override
    public void descuento(Double descuento) {
        setPrecio((getPrecio()* (100 - descuento))/100);
    }
}