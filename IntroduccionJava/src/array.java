import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        ArrayList<String>listaProducto = new ArrayList<>();
        ///ArrayList<String>productosMercado = new ArrayList<>();
        var entrada = new Scanner(System.in);

        System.out.println("Lista de productos disponibles: ");
        listaProducto.add("Cafe Molido");
        listaProducto.add("Pera");
        listaProducto.add("Kiwi");

        listarProductosporfuncion(listaProducto);
        productosEnMayuscula(listaProducto);
//        System.out.println("Frutas disponibles: ");
//        for (String producto : listaProducto){
//            System.out.println(producto);
//        }

//        listaProducto.remove("Pera");
//        listaProducto.add("Manzana ");
//        listaProducto.add("Manzana verde");
//        System.out.println("Frutas modificadas: ");
//        for (String producto : listaProducto){
//            System.out.println(producto);
//        }
//
//        //Buscar producto
//        System.out.println("Ingrese la categoria que quiere ver: ");
//        var verduleria = entrada.nextLine();
//        ///System.out.println("Productos con la letra M");
//        for (String producto : listaProducto){
//            if(producto.charAt(0)== 'M'){
//                System.out.println(producto);
//            }
//        }
     }

    public static void listarProductosporfuncion(ArrayList<String> productos)
    {
        System.out.println("***** Listar productos: ******");

        for (var producto :productos){
            System.out.println(producto);
        }

    }

    public static void productosEnMayuscula(ArrayList<String>productos){
        System.out.println("Mostramos los productos en mayúscula:");

        for (var producto : productos){
            producto = producto.trim().toUpperCase();
            System.out.println(producto);
        }
    }

}
