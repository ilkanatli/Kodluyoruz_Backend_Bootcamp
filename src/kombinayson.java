import java.util.Scanner;
public class kombinayson {
    public static void main(String[] args) {
        // C(n,r) = n! / (r! * (n-r)!)
        Scanner input = new Scanner(System.in);
        int n, r, totaln = 1, totalr = 1, totalnr = 1, combination;
        System.out.print("n sayisini giriniz: ");
        n = input.nextInt();
        System.out.print("r sayisini giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            totaln = totaln * i;
        }
        for (int i = 1; i <= r; i++) {
            totalr = totalr * i;
        }
        for (int i = 1; i  <= (n-r); i++) {
            totalnr = totalnr * i;
        }
        // System.out.println(n + ".Faktoriyel: " + totaln);
        // System.out.println(r + ".Faktoriyel: " + totalr);
        // System.out.println((n-r) + ".Faktoriyel: " + totalnr);
        combination = totaln / (totalr * totalnr);
        System.out.println("Kombinayson:  " + combination);
    }
}

