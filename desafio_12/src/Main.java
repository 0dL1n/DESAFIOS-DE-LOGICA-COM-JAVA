import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vogais = {'a','e','i','o','u'};
        char[] consoantes = {
                'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'
        };

        char carc;
        int verificador;

        do {
            verificador = 0;
            System.out.println("\nDIGITE UM CARACTERE: ");
            carc = scanner.nextLine().toLowerCase().charAt(0);

            for (char v : vogais) {
                if (carc == v) {
                    System.out.println(carc + " é Vogal");
                    verificador = 1;
                    break;
                }
            }


            if (verificador == 0) {
                for (char c : consoantes) {
                    if (carc == c) {
                        System.out.println(carc + " é Consoante");
                        verificador = 1;
                        break;
                    }
                }
            }


            if (verificador == 0) {
                System.out.println("Não é uma letra válida ou é um número/símbolo.");

            }

        } while (verificador == 0);

        scanner.close();
    }
}