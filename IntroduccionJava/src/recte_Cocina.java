import java.util.Scanner;

public class recte_Cocina {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("**** Recetas de Cocina ****");
        System.out.println("Ingrese el nombre de la receta: ");
        var nombre = entrada.nextLine();

        System.out.println("Ingrese los ingredientes principales: ");
        var ingredientes = entrada.nextLine();

        System.out.println("Ingrese el tiempo de preparacion (en min): ");
        var tiempo = Integer.parseInt(entrada.nextLine());

        System.out.println("Tipo de dificultad ? (Facil, media, alta):");
        var dificultad = entrada.nextLine();

        System.out.println("\t **** Recetas de cocina ****");
        System.out.println("Nombre de la receta: "+nombre);
        System.out.println("Ingredientes: "+ingredientes);
        System.out.println("Tiempo de preparación: "+tiempo +" min");
        System.out.println("Dificultad: "+dificultad);
    }
}
