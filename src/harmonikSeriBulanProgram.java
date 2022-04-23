import java.util.Scanner;
public class harmonikSeriBulanProgram {
    public static void main(String[] args) {
        int n;
        double result = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz: ");
        n = input.nextInt();
        for (double i = 1.0; i <= n; i++) {
            result += (1/i);
        }
        System.out.println(result);
    }
}
