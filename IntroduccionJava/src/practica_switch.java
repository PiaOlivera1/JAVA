import java.util.Scanner;

public class practica_switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long x, y;
        long resultado;
        short cont =0;

        System.out.print("1.  2x + 4\n");
        System.out.print("2.  6x - 2y + 9 \n");
        System.out.print("3.  (2x + 4) / x \n");
        System.out.print("4.   (6x - 2y + 9) / (x - y) \n");
        System.out.print("**** Ingrese la opcion que desea a realizar ****\n ");
        var opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                System.out.println("2x+ 4\n");
                System.out.println("Ingrese el valor de X");
                x = entrada.nextInt();
                resultado = 2 * x +4;
                System.out.printf(" 2 x %d + 4 = %d", x, resultado);
                break;
            case 2:
                System.out.println("6x - 2y + 9");
                System.out.println("Ingrese el valor de x: ");
                x = entrada.nextInt();
                System.out.println("Ingrese el valor de y: ");
                y = entrada.nextInt();
                resultado = 6 * x - 2 * y + 9;
                System.out.printf("6 x %d - 2 x %d + 9 = %d ",x,y, resultado);
                break;
            case 3:
                System.out.println("(2x + 4) / x");
                System.out.println("Ingrese el valor de x: ");
                x = entrada.nextInt();
                while (x ==0){
                    System.out.println("x no puede valer cero, ingrese un valor valido para x: ");
                    x = entrada.nextInt();
                }
                /*if (x == 0){
                    System.out.println("Ingrese un valor valido para x: ");
                    x = entrada.nextInt();
                }*/
                resultado = (2 * x + 4)/ x;
                System.out.printf("(2 x %d + 4) / %d = %d",x,x,resultado);
                break;
            case 4:
                System.out.println(" (6x - 2y + 9) / (x - y)");
                System.out.println("Ingrese el valor de x:");
                x = entrada.nextInt();
                while (x ==0){
                    System.out.println("x no puede valer cero, ingrese un valor valido: ");
                    x = entrada.nextInt();
                }
                System.out.println("Ingrese el valor de y: ");
                y = entrada.nextInt();
                while (y ==0){
                    System.out.println("y no puede valer cero, ingrese un valor valido: ");
                    y = entrada.nextInt();
                }
                if (x - y ==0){
                    System.out.printf("No hay solucion para los valores de x = %d e y = %d",x,y);
                }
                resultado = (6 * x - 2* y +9)/ (x -y);
                System.out.printf("(6 x %d - 2x %d +9)/(%d- %d) = %d ",x,y,x,y,resultado);
        }
    }
}
