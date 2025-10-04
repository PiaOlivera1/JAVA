import java.sql.SQLOutput;
import java.util.Scanner;

public class cajeroAutomatico {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        var salir = false;
        var saldo_inicial = 1000.00;
        while(!salir){
            System.out.printf("""
                    *** Operaciones que puedes realizar:
                    1. Depositar
                    2. Retirar
                    3.Consultar saldo
                    4.Salir
                    Ingrese una opcion: 
                    """);
            var opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad de dinero a depositar: ");
                    var deposito = entrada.nextDouble();
                    saldo_inicial += deposito;
                    break;
                case 2:
                    System.out.println("Cuánto dinero desea retirar: ");
                    var retiroDinero = entrada.nextDouble();
                    if (retiroDinero> saldo_inicial){
                        System.out.println("Dinero insuficiente...");
                    }else {
                        saldo_inicial = saldo_inicial - retiroDinero;
                    }
                    break;
                case 3:
                    System.out.printf("Saldo disponible $%.2f" ,saldo_inicial);
                    break;
                case 4:
                    System.out.println("Saliendo de la app....");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
