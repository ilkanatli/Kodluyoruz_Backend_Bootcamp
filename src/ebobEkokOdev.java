import java.util.Scanner;

public class ebobEkokOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, i = 1, ebob = 1, k = 1;
        System.out.print("n1 sayisini giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 sayisini giriniz: ");
        n2 = input.nextInt();


        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.println("E.B.O.B: " + ebob);
        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                System.out.print(k);
            }
            k++;
            break;
        }
        System.out.println("E.K.O.K: " + k);
    }
}
