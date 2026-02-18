import java.util.*;

//Faça um Programa que leia três números e mostre-os em ordem decrescente.

//           [10,20,30,50,-10]
//  indice   (0 , 1, 2, 3, 4)

public class Main {

        public static void insertionsort(int[] array) {
            for (int i = 1; i < array.length; i++) {
                int chave = array[i];
                int j = i - 1;

                while (j >= 0 && array[j] < chave) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = chave;
            }
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            //criando um array com 3 itens
            int[] num = new int[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("digite um numero: ");
                int numero = scanner.nextInt();
                num[i] = numero;
            }

            insertionsort(num);


            System.out.println(Arrays.toString(num));
            scanner.close();


        }
    }
