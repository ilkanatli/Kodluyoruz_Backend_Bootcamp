import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, result = 0;
        System.out.print("Bir sayi giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= (n - 1); i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        if (result == n) {
            System.out.println(n + " mukemmel bir sayidir.");
        } else {
            System.out.println(n + " mukemmel bir sayi degildir.");
        }
    }
}
