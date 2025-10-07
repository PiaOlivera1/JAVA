import java.util.Scanner;

public class validacionPassword {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        var salir = false;

        while(!salir)
        {
            System.out.printf("""
                    Creación de contraseña
                    8 caracteres o mas
                    Al menos una mayúscula
                    Ingrese la contraseña: \s
                    """);
            var contrasena = entrada.nextLine().trim();
            if (contrasena.length()>=8)
            {
                var tiene_mayusucula = false;
                for (var i =0; i< contrasena.length(); i++)
                {
                    if (Character.isUpperCase(contrasena.charAt(i)) )
                    {
                        tiene_mayusucula = true;

                    }

                }
                if (tiene_mayusucula)
                {
                    System.out.println("Contraseña valida");
                    salir = true;
                } else
                {
                    System.out.println("Debe tener al menos una mayúscula");
                }
            }
            else
            {
                System.out.println("La contraseña debe tener al menos 8 caracteres: \n");
            }

        }
    }
}
