import java.util.Scanner;
public class sinifiGecmeDurumuOdev {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        matematik = input.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Turkce notunu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Muzik notunu giriniz: ");
        muzik = input.nextInt();

        double ortalama;
        ortalama = (matematik + fizik + turkce + kimya + muzik) / 5;

        if ((matematik >= 0 && matematik <= 100) && (fizik >= 0 && fizik <= 100) && (turkce >= 0 && turkce <= 100) &&
                (kimya >= 0 && kimya <= 100) && (muzik >= 0 && (muzik <= 100 ))){
            if (ortalama <= 55){
                System.out.print("Sinifta kaldiniz, seneye tekrar gorusmek uzere!");
            }
            else {
                System.out.print("Tebrikler sinifi gectiniz!");
            }
        }
        else {
            System.out.print("Lutfen ders notlarini 0 ile 100 arasinda olacak sekilde giriniz!");
        }
    }
}
