import java.util.Random;
import java.util.Scanner;

public class generadorId {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        var nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        var apellido = entrada.nextLine();

        Random random = new Random();
        var anio_nac = random.nextInt(2025-1950+1)+1950;

        System.out.printf("""
                Nombre: %s
                Apellido: %s
                Año: %04d
                """, nombre, apellido, anio_nac);


        var edad = 2025 - anio_nac;
        System.out.printf("%s tiene %d años",nombre,edad);

        var nombre2 = nombre.strip().substring(0,2).toUpperCase();


        var apellido2 = apellido.strip().substring(0,2).toUpperCase();

        var anio2 = String.valueOf(anio_nac).substring(2);

        var usuario = ""+ nombre2 + apellido2 + anio2;
        System.out.println("\n*** Su usuario fue creado exitosamente ***");
        System.out.printf("usuario: %s" ,usuario);

    }
}
