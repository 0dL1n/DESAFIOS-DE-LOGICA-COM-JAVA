import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double m2lata = 108;
        int valorlata = 80;

        double m2galao = 21.6;
        int valorgalao = 25;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos m² tem a área que será pintada?");
        double area = scanner.nextDouble() * 1.1;

        if (area <= 21.6) {
            System.out.println("Comprar 1 galão. Valor: 25,00");
        } else if (area <= 64.8) {
            System.out.println("Comprar 3 galões de 3.6l total: " + (3 * valorgalao));
        } else if (area > 64.8 && area <= 108) {
            System.out.println("Comprar 1 Lata. Valor: 80,00");
        } else {

            double litrosNecessarios = area / 6;
            int latasMistura = (int) (litrosNecessarios / 18);
            double sobraLitros = litrosNecessarios % 18;
            double galoesMistura = Math.ceil(sobraLitros / 3.6);

            double precoMistura = (latasMistura * 80.0) + (galoesMistura * 25.0);


            System.out.printf("Mistura -> Latas: %d, Galões: %.0f | Preço Total: R$ %.2f%n",
                    latasMistura, galoesMistura, precoMistura);
        }

        scanner.close();
    }
}