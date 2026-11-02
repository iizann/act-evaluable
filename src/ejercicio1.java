import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de un archivo");
        String archv = sc.nextLine();
        archivos(archv);
    }

    public static void archivos(String archivos) {
        int pos = archivos.indexOf(".");
        int ultimo = archivos.lastIndexOf(".");
        int largo = archivos.length();
        if (pos > 0 && pos == ultimo && ultimo != largo - 1) {
            System.out.println(archivos.substring(pos + 1));
        } else {
            System.out.println("archivo erróneo");
        }
    }
}





