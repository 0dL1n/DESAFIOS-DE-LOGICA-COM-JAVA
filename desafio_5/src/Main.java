import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor Metros para Centimetros" + "\n");
        System.out.println("Digite o valor em Metros: ");
        double vmetros = scanner.nextDouble();

        System.out.println("o valor em Centimetros é: " + (vmetros * 100) + "cm");

        scanner.close();
     }
}