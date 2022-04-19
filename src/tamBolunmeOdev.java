import java.util.Scanner;
public class tamBolunmeOdev {
    public static void main(String[] args) {
        int sayi, toplam = 0, terimSayisi = 0;
        double ortalama;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        sayi = inp.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 12 == 0) {
                toplam += i;
                terimSayisi += 1;
            }
        }
        ortalama = toplam / terimSayisi;
        System.out.println("3'e ve 4'e bolunebilen sayilarin ortalamasi : " + ortalama);
    }
}
