import java.util.Scanner;

public class generador_codigo_producto {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);
        System.out.println("Ingresa el nombre del producto: ");
        var nombre_producto = entrada.nextLine();
        System.out.println("Ingresa la categoria del producto:");
        var categoria_producto = entrada.nextLine();

        //eliminamos especios de adelante y atras
        var nombre = nombre_producto.strip();

        // eliminamos los espacion con el método replace
        nombre =nombre.replace(" ", "");

        //pasamos a minuscula con el método to lowercase()
        nombre =nombre.toLowerCase();

        // agarramos las primeras cinco letras con el método substring
        if (nombre.length() >5) {
            nombre = nombre.substring(0, 5);
        }
        //System.out.println(nombre);

        //Categoria
        //eliminamos los espacios de atras y delante con el método strip
        var categoria = categoria_producto.strip();

        //agarro los primeros dos caracteres con el método substring
        if(categoria.length()>2) {
            categoria = categoria.substring(0, 2);
            //paso a matuscula con el método touppercase
            categoria = categoria.toUpperCase();
        }
        else {
            categoria = categoria.toUpperCase();
        }

        System.out.println("Producto: "+ nombre);
        System.out.println("Categoria: "+categoria);

    }
}
