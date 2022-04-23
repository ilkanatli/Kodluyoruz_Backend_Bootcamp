import java.util.Scanner;

public class basamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz: ");
        int number = number = input.nextInt(), basNumber = 0, basValue = 0;
        int tempNumber = number;
        int result = 0;
        // 1643 / 10 = 164 // 1643 % 10 = 3
        // 164 / 10 = 16   // 164 % 10 = 4
        // 16 / 10 = 1     // 16 % 10 = 6
        // 1 / 10 = 0      // 1 % 10 = 1
        // 0 / 10 = 0
        while (tempNumber != 0) {
            basNumber ++;
            tempNumber /= 10;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }
        System.out.println("Girilen sayiynin basamaklarindaki sayilarin toplami: " + result);
    }
}
