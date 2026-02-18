/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.

Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.

João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.

Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora rendimentos Joao \n \n");

        System.out.println("Quantos kgs de peixe você pescou? ");
        double kgpeixe = scanner.nextDouble();

        double multa = 0;
        if(kgpeixe > 50){
            multa = (kgpeixe-50)*4;

        }

        System.out.println("o valor da multa é " + multa + " reais");

        scanner.close();

    }
}