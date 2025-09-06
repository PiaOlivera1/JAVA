import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        double precioTotal;
        System.out.println("**** Bienvenidos al Hotel ****\n Para realizar la reserva, complete los siguentes datos...: ");

        System.out.println("Ingrese el nombre del cliente: ");
        var nombre = entrada.nextLine();

        System.out.println("Ingrese los dias de estadias: ");
        var dias_estadia = Integer.parseInt(entrada.nextLine());

        System.out.println("Desea vista al mar: ");
        String respuesta = entrada.nextLine();

        boolean vista_al_mar= respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("true") || respuesta.equals("True");

        if (vista_al_mar){
            precioTotal = 190.50 * dias_estadia;
        }
        else{
            precioTotal = 150.50 * dias_estadia;
        }

        System.out.printf("""
                **** RESERVA EXITOSA ****
                Nombre del cliente: %s
                Días de estadia: %d
                Habitación con vista al mar: %s
                Precio Total: %.2f
                """, nombre, dias_estadia, respuesta, precioTotal);
    }
}
