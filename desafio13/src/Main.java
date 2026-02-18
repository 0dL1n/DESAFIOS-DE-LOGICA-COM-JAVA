import java.util.*;




//Faça um Programa que leia três números e mostre o maior deles.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("quantos numeros deseja comparar?");
        int quant = scanner.nextInt();

        double maior = Double.NEGATIVE_INFINITY;
        for(int i = 0; i < quant; i++){
            System.out.println("Digite um numero: ");
            double num = scanner.nextDouble();

            if(num >maior){
                maior = num;
            }

        }
        System.out.println("o maior numero é:" + maior);





    }
}