import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la cadena de letras");
        String texto = sc.nextLine();
        System.out.println(cadena(texto));
    }

    public static String cadena(String texto) {
        char letra = texto.charAt(0);
        int contador = 1;
        String resultado = "";
        for (int i = 1; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contador++;
            } else {
                resultado = resultado + letra + contador;
                letra = texto.charAt(i);
                contador = 1;
            }
        }
        resultado = resultado + letra + contador;
        return resultado;
    }
}