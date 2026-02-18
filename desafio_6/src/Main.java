import java.util.Scanner;
import java.lang.Math.*;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de área do Circulo: \n");

        System.out.println("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();

        System.out.println("A area do circulo é " + (PI*raio*raio));

        scanner.close();




    }
}