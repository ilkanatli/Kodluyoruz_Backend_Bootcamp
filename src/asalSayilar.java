import java.util.Scanner;
public class asalSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dongu = 0;
        for (int i = 2; i <= 100; i++) {
            int durum = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    durum = 1;
                    break;
                }
            }
            if (durum == 0){
                System.out.print(i + " ");
                dongu++;
            }
        }
    }
}
