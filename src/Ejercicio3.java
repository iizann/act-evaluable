import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        palindromo(frase);
    }

    public static void palindromo(String frase) {
        String limpia = frase.toLowerCase();
        limpia = limpia.replaceAll(" ", "");
        boolean esPalindromo = true;
        for (int i = 0; i < limpia.length() / 2; i++) {
            if (limpia.charAt(i) != limpia.charAt(limpia.length() - 1 - i)) {
                esPalindromo = false;
            }
        }
        if (esPalindromo) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }
}

