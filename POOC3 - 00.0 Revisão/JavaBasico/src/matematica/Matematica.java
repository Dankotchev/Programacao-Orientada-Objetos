package matematica;

import java.util.Scanner;

public class Matematica {

    public static int leituraInteiros(char z) {
        int valor;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um valor inteiro para " + z + ": ");
        valor = leitor.nextInt();
        
        return valor;
    }

    public static int calcularExponencial(int x, int y) {
        int resultado = 1;
        for (int i = 1; i <= y; i++) {
            resultado *= x;
        }
        return resultado;
    }

    public static void menorValor(int x, int y) {
        if (x < y) {
            System.out.println("O valor x é menor que y : " + x + " < " + y);
        } else {
            System.out.println("O valor y é menor que x : " + y + " < " + x);
        }
    }

    public static int fatorialN(int x) {
        int fatorial = 1;
        for (int i = x; i >= 1; i--) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        int x, y;
        x = leituraInteiros('x');
        y = leituraInteiros('y');
        System.out.println("A expressão " + x + "^" + y + " = " + calcularExponencial(x, y));
        menorValor(x, y);
        System.out.println("O fatorial de " + x + "! = " + fatorialN(x));
    }
}
