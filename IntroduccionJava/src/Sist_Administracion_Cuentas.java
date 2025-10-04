import java.net.SocketPermission;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Sist_Administracion_Cuentas {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        var salir = false;


        while (!salir){
            System.out.printf("""
                    **** Sistema de Administración de Cuentas ***
                    Menú:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoje una opción:\s
                    """);

            var opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Creando cuenta....\n");
                    break;
                case 2:
                    System.out.println("Eliminando cuenta...\n");
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...\n");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción invalida..");

            }
            if (opcion ==3){
                System.out.println("Salio correctamente del sistema, vuelva pronto...");
            }
        }



    }
}
