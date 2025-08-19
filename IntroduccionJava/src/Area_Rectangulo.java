import java.util.Scanner;

public class Area_Rectangulo {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        float area;
        float perimetro;
        System.out.println("Ingrese la altura del rectangulo: ");
        var altura = Float.parseFloat(entrada.nextLine());

        System.out.println("Ingrese la base del rectangulo: ");
        var base = Float.parseFloat(entrada.nextLine());

        area = base * altura;
        perimetro = 2 * (base + altura);
        System.out.printf("""
                Rectangulo %.1f cm x %.1f cm
                Area %.1f
                Perimetro %.1f
                """,base, altura, area, perimetro);


    }
}
