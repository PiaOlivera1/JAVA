import java.util.Scanner;

public class Empleados {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado");
        var nombre = entrada.nextLine();

        System.out.println("Ingrese la edad:");
        var edad = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese el salario:");
        var salario = Double.parseDouble(entrada.nextLine());

        System.out.println("Es jede de departamento?: (True or false)");
        var es_jefe = Boolean.parseBoolean(entrada.nextLine());

        System.out.println("**** Sistema de Empleados ****");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
        System.out.println("Jefe de departamento: "+es_jefe);
    }
}
