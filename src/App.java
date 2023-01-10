public class App {
    public static void main(String[] args) throws Exception {
        int num = 9;

        for (int i = 1; i <= num; i++) {
            String strFormatada = "";
            for (int j = 1; j <= i; j++) {
                strFormatada += i;
            }

            System.out.println(strFormatada);
        }
    }
}
