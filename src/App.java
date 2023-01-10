import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira um número: ");
            int num = sc.nextInt();

            System.out.println("\n"); // New line

            for (int i = 1; i <= num; i++) {
                String strFormatada = "";
                for (int j = 1; j <= i; j++) {
                    strFormatada += i;
                }

                System.out.println(strFormatada);
            }
        }
    }
}
