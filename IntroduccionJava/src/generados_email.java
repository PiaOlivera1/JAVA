public class generados_email {
    public static void main(String[] args) {
        String nombre = "Pia Olivera";
        String empresa = "BBVA S.A";
        String dominio = ".com.ar";

        //limpiamos los espacios del inicio al fin
        var nombre_sin_espacio = nombre.strip();

        //reemplazamos los espacios en blanco por un punto con elmétodo replace
        nombre_sin_espacio = nombre_sin_espacio.replace(" ", ".");

        //convertimos a minuscula
        nombre_sin_espacio = nombre_sin_espacio.toLowerCase();

        System.out.println(nombre_sin_espacio);

        // datos de la empresa
        var empresa_sin_espacion = empresa.strip();

        //reemplazamos los espacion por puntos
        empresa_sin_espacion = empresa_sin_espacion.replace(" ", ".");
        //Convertimos a minuscula
        empresa_sin_espacion = empresa_sin_espacion.toLowerCase();
        System.out.println(empresa_sin_espacion);

        System.out.println("Email= "+nombre_sin_espacio +"@"+empresa_sin_espacion+dominio);
    }
}
