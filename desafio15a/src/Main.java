import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, -50, -2};

        for (int i = 1; i < num.length; i++) {
            int chave = num[i];
            int j = i - 1;


            while (j >= 0 && num[j] < chave) {
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = chave;

        }
    }
}
