import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluşturdum.
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfını oluşturdum.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alalım.
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih= input.nextInt();

        System.out.print("Muzik Notunuz: ");
        muzik = input.nextInt();

        //Ortalama Hesaplama

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalama : "+ sonuc);

        //Sınıfı geçeme durumu

        String not = (sonuc >= 60) ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.print(not);
    }
}
