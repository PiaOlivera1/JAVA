import java.util.Scanner;

public class Casa_de_los_espejos {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("**** Bienvenido a la CASA DE LOS ESPEJOS ****");
        System.out.println("Ingrese su edad:");
        var edad = Integer.parseInt(entrada.nextLine());

        System.out.println("Tiene miedo a la oscuridad?: ");
        String respuesta = entrada.nextLine().trim().toLowerCase();

        boolean tiene_miedo = respuesta.equals("si") || respuesta.equals("s") || respuesta.equals("true");

        if ((edad>=10) && (!tiene_miedo)){
            System.out.println("Bienvenido, Puede jugar!");
        }
        else {
            System.out.println("Lo siento, la casa de los espejos podria darte miedo");
        }
    }
}
