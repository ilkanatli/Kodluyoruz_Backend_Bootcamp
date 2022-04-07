import java.util.Scanner;
public class daireDilimiAlani {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım

        int r, a;
        double pi = 3.14, daireDilimiAlani;

        //Kullanıcıdan verilerimizi alalım

        Scanner input = new Scanner(System.in);
        System.out.print("Yaricapi giriniz : ");
        r = input.nextInt();

        System.out.print("Merkez acisini giriniz : ");
        a = input.nextInt();

        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        daireDilimiAlani = (pi * (r * r) * a) / 360;
        System.out.println("Daire Dilimi Alani: " + daireDilimiAlani);

    }
}
