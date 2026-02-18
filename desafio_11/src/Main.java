import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sex;

        do {
            System.out.println("Qual seu sexo? Digite F ou M?: ");
            sex = scanner.nextLine().toLowerCase().charAt(0);

            if(sex != 'f' && sex != 'm') {
                System.out.println("vc digitou um caractere invalido, tente novamente");
            }
        } while(sex != 'f' && sex != 'm');

        if (sex == 'm'){
            System.out.println("O seu genero e masc");
        }else {
            System.out.println("o seu genero e fem");
        }





    }
}