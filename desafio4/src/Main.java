import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;

        for(int i = 1; i < 5; i++){
            System.out.println("Digite a nota do " + i + "° bimestre");
            double notabim = scanner.nextDouble();
            nota += notabim;
        }
        System.out.printf("A media do Aluno foi " + (nota/4));

        scanner.close();

    }
}