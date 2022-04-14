import java.util.Scanner;
public class daireAlanCevre {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, alan, cevre;

        Scanner input = new Scanner(System.in);
        System.out.print("Yaricapi giriniz: ");
        r = input.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r * r;

        System.out.println("Dairenin cevresi: " + cevre);
        System.out.println("Dairenin alani: " + alan);
    }
}
