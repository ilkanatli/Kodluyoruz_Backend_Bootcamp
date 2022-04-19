import java.util.Scanner;
public class ciftVe4unKatlariToplam {
    public static void main(String[] args) {

        int num, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print(" Bir Sayi Giriniz: ");
            num = input.nextInt();
            if (num % 2 == 0 && num % 4 == 0) {
                total += num;
            }
        } while (num % 2 == 0);
        System.out.println("Toplam: " + total);
    }
}
