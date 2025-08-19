import java.util.Scanner;

public class rango {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);


        System.out.println("Cuántos productos compro? ");
        var productos = Integer.parseInt(entrada.nextLine());

        System.out.println("Es miembro de la tienda ? (true or false)");
        var es_miembro = Boolean.parseBoolean(entrada.nextLine());

        if((productos >10) && !(es_miembro = true)){
            System.out.printf("Usted obtiene el descuento");
        }
        else{
            System.out.printf("No obtendra el descuento ");
        }


    }
}
