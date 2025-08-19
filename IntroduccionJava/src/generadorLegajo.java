import java.util.Random;
import java.util.Scanner;

//Hacé un programa que genere de forma aleatoria los siguientes datos de un estudiante:
//
//Un número de legajo aleatorio de 5 cifras (por ejemplo: 03567, 12890, etc.)
//
//Un año de ingreso aleatorio entre 2015 y 2025.
public class generadorLegajo {
    public static void main(String[] args) {
        Random random = new Random();
        var entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante a buscar: ");
        var nombre = entrada.nextLine();
        var legajo = random.nextInt(10000);
        var anio_ingreso = random.nextInt(2025-2015+1)+2015;

        System.out.printf("""
                Nombre del estudiante: %s
                Legajo : %05d
                Año de ingreso %d
                """,nombre,legajo, anio_ingreso);





    }
}
