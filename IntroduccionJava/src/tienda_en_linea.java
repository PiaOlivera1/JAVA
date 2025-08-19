import java.util.Scanner;

public class tienda_en_linea {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        double descuento;
        double total;

        System.out.println("Ingrese el monto que gasto: ");
        float monto = Float.parseFloat(entrada.nextLine());

        System.out.println("Ingrese si es miembro de tienda:");
        String respuesta = entrada.nextLine().trim().toLowerCase();

        boolean es_miembro = respuesta.equals("si")|| respuesta.equals("s") || respuesta.equals("true");

        if ((monto> 1000) && (es_miembro)){
            descuento = monto * 0.10;
            total = monto - descuento;
            System.out.printf("Su precio final con descuento incluido del 10%% es de: $ %.2f",total);

        }
        else if (es_miembro){
            descuento = monto *0.05;
            total = monto - descuento;
            System.out.printf("Su precio final con descuento incluido del 5%% es de: $ %.2f",total);
        }
        else{
            System.out.printf("No obtiene descuento. El total sin descuento es de $ %.2f",monto);
        }
    }
}
