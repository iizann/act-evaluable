import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una expresión");
        String expresion = sc.nextLine();
        System.out.println(evaluar(expresion));
    }

    public static int evaluar(String expresion) {
        int total = 0;
        int termino = 0;
        int numero = 0;
        char operador = '+';

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            boolean esDigito = c >= '0' && c <= '9';

            if (esDigito) {
                numero = numero * 10 + (c - '0');
            }

            if (!esDigito || i == expresion.length() - 1) {
                if (operador == '+') {
                    total = total + termino;
                    termino = numero;
                } else if (operador == '-') {
                    total = total + termino;
                    termino = -numero;
                } else if (operador == '*') {
                    termino = termino * numero;
                } else if (operador == '/') {
                    termino = termino / numero;
                }
                operador = c;
                numero = 0;
            }
        }
        total = total + termino;
        return total;
    }
}