import java.util.Scanner;
public class maxVeMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, i = 1, number, min = 0, max = 0;
        System.out.print("Kac tane sayi gireceksiniz: ");
        N = input.nextInt();
        while (i <= N) {
            System.out.print(i + ".sayiyi  giriniz: ");
            number = input.nextInt();
            if (min < number && max < number) {
                max = number;
                if (min == 0) {
                    min = number;
                }
            }
            if (min > number && max > number) {
                min = number;
                if (max == 0) {
                    max = number;
                }
            }
            i++;
        }
        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: "+ min);
    }
}
