import java.util.Scanner;

public class Sistema_bancario {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("*** BIENVENIDO AL SISTEMA BANCARIO ***");
        System.out.println("Desea salir del sistema? ");
        String respuesta = entrada.nextLine().trim().toLowerCase();

        boolean desea_salir = respuesta.equals("s") || respuesta.equals("si") || respuesta.equals("true");

        if (!desea_salir){
            System.out.println("Continuamos dentro del sistema");
        }
        else {
            System.out.println("Saliendo del sistema");
        }
    }
}
