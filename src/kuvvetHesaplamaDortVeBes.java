import java.util.Scanner;
public class kuvvetHesaplamaDortVeBes {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i*=4) {
            System.out.println("Dordun katlari: "+ i);
        }
        for (int i = 1; i <= n; i*=5) {
            System.out.println("Besin katlari: " + i);
        }
    }
}
