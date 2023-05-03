package MODELS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        //String nombre, Integer stock, Double precio, Boolean tieneRuedas
        Producto silla1 = new Sillas("sillita", 3, 300d , true);
        Producto silla2 = new Sillas("sillota", 5, 250d , false);
        Producto escritorio1 = new Escritorio("escritorio Gamer",6 ,  500d, 12.5d , 14.4 );
        //String nombre, Integer stock, Double precio, String nombreFabricante, Integer impresionesXMin
        Producto impresora = new Impresora("xp211", 9, 105.3,"Epson", 100 );
        Producto    notebook = new Notebook("Thinkpad", 8, 506.4, "Lenovo", 256.6);

        System.out.println("Cargando productos\n");

        productos.add(silla1);
        productos.add(silla2);
        productos.add(escritorio1);
        productos.add(impresora);
        productos.add(notebook);

        System.out.println("----------------------------------------------------------------");
        System.out.println("Mostramos de que instancia son los productos \n");

        for(Producto product : productos){
            System.out.println("Instancia es: "+ instancia(product)+" Del Producto: "+ product.getNombre());
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("Descuento de Impresora y Sillas \n ");
        Scanner teclado = new Scanner(System.in);
        Double descuentoImpresora;
        Double descuentoSilla;
        System.out.println("El Precio de antes es: \n");
        System.out.println("\n El precio de la sillota es: "+ silla2.getPrecio());
        System.out.println("\n El precio de la Epson xp211 es: "+ impresora.getPrecio());

        System.out.println("\n Ingrese el descuento en %  que desea aplicar a la silla: ");
        descuentoImpresora = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("\n Ingrese el descuento en % que desea aplicar a la Impresora: ");
        descuentoSilla = teclado.nextDouble();
        teclado.nextLine();

        for(Producto product2 : productos){
            if(product2 instanceof Sillas){
                ((Sillas) product2).descuento(descuentoSilla);
            }
            if(product2 instanceof Impresora){
                ((Impresora) product2).descuento(descuentoImpresora);
            }
        }

        System.out.println("El nuevo precio de la impresora es: "+ impresora.getPrecio() );
        System.out.println("El nuevo precio de la Sillota es: "+ silla2.getPrecio() );
        System.out.println("----------------------------------------------------------------");
        System.out.println("Estos son nuestros Productos: ");
        for(Producto product : productos){
            System.out.println(product.toString());
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("\n ACTUALIZAMOS LOS PRECIOS: ");

        for(Producto product : productos){
            product.actPrecio();
            System.out.println(product.toString());
        }






    }

    public static String instancia(Producto product){
        String tipo = "";
        if (product instanceof Sillas){
            tipo = "Silla";
        }
        if (product instanceof Escritorio){
            tipo = "Escritorio";
        }
        if (product instanceof Impresora ){
            tipo= "Impresora";
        }
        if (product instanceof  Notebook){
            tipo = "Notebook";
        }
        return  tipo;
    }

}