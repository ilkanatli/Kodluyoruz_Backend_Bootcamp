import java.util.Scanner;
public class cinZodyagıHesaplama {
    public static void main(String[] args) {
        int dogumYili;
        String burc = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Dogum Yilinizi Giriniz: ");
        dogumYili = input.nextInt();

        switch (dogumYili % 12) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Kopek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Okuz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavsan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yilan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
        }
        System.out.println("Burcunuz: " + burc);
    }
}
