import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você ganha por hr? ");
        double salhr = scanner.nextDouble();
        System.out.println("Quanto hrs vc trabalha no mês? ");
        int hrmes = scanner.nextInt();

        double salbruto = (salhr * hrmes);
        double descir = (salbruto*0.11);
        double descinss = (salbruto*0.08);
        double descsind = (salbruto*0.05);
        double salliquid = (salbruto-(descinss+descir+descsind));
        System.out.println("+ Salário Bruto: R$" + salbruto + "\n" + "- IR(11%): R$" + descir + "\n" + "- INSS(8%): R$" + descinss + "\n" + "- Sindecato(5%): R$" +  descsind + "\n" + "= Salário Líquido: R$" + salliquid);



    }
}