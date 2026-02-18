import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        System.out.println("O numero digitado foi: " + num);

        scanner.close();

    }
}