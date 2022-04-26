import java.util.Scanner;
public class deseneGoreMetot {
    static void pattern(int n) {

        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        pattern(n-5);

        System.out.print(n + " ");
    }


    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);

        System.out.print("N sayisini giriniz: ");
        N = input.nextInt();

        pattern(N);

    }
}