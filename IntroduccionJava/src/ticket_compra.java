import java.util.Scanner;

public class ticket_compra {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        float multiplicacion;
        float multi2;

        System.out.println("Ingrese el articulo que compro: ");
        var articulo = entrada.nextLine();
        System.out.println("Ingrese la cantidad: ");
        var cantidad = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el precio: ");
        var precio = Float.parseFloat(entrada.nextLine());

        System.out.println("Ingrese el articulo que compro: ");
        var articulo2 = entrada.nextLine();
        System.out.println("Ingrese la cantidad: ");
        var cantidad2 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el precio: ");
        var precio2 = Float.parseFloat(entrada.nextLine());

        articulo = articulo.toUpperCase();
        multiplicacion = cantidad * precio;

        articulo2 = articulo2.toUpperCase();
        multi2 = cantidad2 * precio2;
        var total = multiplicacion + multi2;
        var impuesto = total * 0.21;
        var total_c_impuesto = total + impuesto;

        System.out.println("*** Impresion de Ticket ****");
        System.out.printf("""
                %s .......%d......... %.2f
                %s .......%d......... %.2f
                Impuesto   21%% ..... %.2f
                TOTAL ............... %.2f 
                """,articulo,cantidad,precio,articulo2,cantidad2,precio2,impuesto,total_c_impuesto);

    }
}
