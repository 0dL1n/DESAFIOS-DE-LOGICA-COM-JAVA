import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora Peso Ideal \n \n");

        System.out.println("Você é Homem ou mulher?(Responda com h ou m): ");
        String sexo = scanner.next().toLowerCase();

        System.out.println("Qual a sua altura?: ");
        double alt = scanner.nextDouble();

        double pesoideal = 0;
        if(sexo.equals("h")){
            pesoideal = (72.7*alt)-58;
        }else if (sexo.equals("m")) {
            pesoideal = (62.1*alt)-44.7;
        }

        System.out.println("seu peso ideal é: " + pesoideal);

        scanner.close();

    }
}