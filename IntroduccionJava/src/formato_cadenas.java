public class formato_cadenas {
    public static void main(String[] args) {
        var nombre = "Martina";
        var edad = 35;
        var salario = 21000.5;

        //formar String
        var mensaje = String.format("Nombre : %s , edad: %d, salario  $%.2f", nombre, edad, salario);
        System.out.println(mensaje);
    }
}
