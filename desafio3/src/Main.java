import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um numero: ");
        int num2 = scanner.nextInt();

        System.out.println("A Soma dos dois numeros é: " + (num1 + num2));

        scanner.close();



    }
}