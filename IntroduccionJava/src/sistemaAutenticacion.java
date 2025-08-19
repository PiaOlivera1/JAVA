import java.util.Scanner;

public class sistemaAutenticacion {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        final var USUARIO = "USUARIO123";
        final var CONTRASENA = "picachu123";

        System.out.println("Ingrese su usuario:");
        var usu = entrada.nextLine();

        System.out.println("Ingrese su contraseña");
        var contra = entrada.nextLine();

        if (USUARIO.equals(usu) && CONTRASENA.equals(contra)){
                System.out.println("Usuario y contraseña validos, BIENVENID@");
        }else {
            System.out.println("Usuario o contrasela INCORRECTO");
        }
    }
}
