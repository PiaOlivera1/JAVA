import java.util.Scanner;

public class app_salud_fitness {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        final int META_PASOS_DIARIO =10000;
        final double CALORIAS_POR_PASO = 0.04;

        System.out.println("Ingrese nombre de usuario: ");
        String usuario = entrada.nextLine();

        System.out.println("Ingrese la canridad de pasos caminados en el dia: ");
        var pasos_en_el_dia = Integer.parseInt(entrada.nextLine());

        if (pasos_en_el_dia> META_PASOS_DIARIO){
            System.out.printf("""
                    *** Usuario: %s
                       FELICITACIONES USTED SUPERO LOS PASOS DIARIOS  %d  pasos
                       CALORIAS QUEMADAS: %.2f *** 
                    """,usuario ,pasos_en_el_dia, pasos_en_el_dia*CALORIAS_POR_PASO);
        }
        else if(pasos_en_el_dia == META_PASOS_DIARIO){
            System.out.printf("""
                    *** Usuario: %s
                        USTED ALCANZO LOS PASOS DIARIOS:   %d pasos 
                       CALORIAS QUEMADAS: %.2f ***
                    """,usuario ,pasos_en_el_dia, pasos_en_el_dia*CALORIAS_POR_PASO);
        }
        else {
            System.out.printf("""
                    USTED NO SUPERO LOS PASOS DIARIOS,
                    Usuario: %s
                    pasos: %d
                    calorias quemadas: %.2f 
                    """, usuario, pasos_en_el_dia ,pasos_en_el_dia *CALORIAS_POR_PASO);
        }
    }
}
