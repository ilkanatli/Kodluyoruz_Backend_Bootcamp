import java.util.Scanner;
public class kullaniciGirisiOdev {
    public static void main(String[] args){
        String userName, password, secim, newPassword;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici adinizi giriniz: ");
        userName = input.nextLine();
        System.out.print("Sifrenizi giriniz: ");
        password = input.nextLine();


        if (userName.equals("patika") && (password.equals("java123"))){
            System.out.print("Bilgileriniz dogru, giris basarili");
        }
        else if (userName.equals("patika") && (password.equals("java1234"))){
            System.out.println("Sifreniz hatali. Sifrenizi sifirlamak ister misiniz?");
            System.out.print("Seciminiz: ");
            secim = input.nextLine();
            if (secim.equals("evet")) {
                System.out.print("Yeni sifrenizi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals("java1234") || (newPassword.equals("java123"))) {
                    System.out.print("Sifre olusturulamadi. Lutfen baska sifre giriniz.");
                }
                else{
                    System.out.print("Sifre olusturuldu.");
                }
            }
        }
        else {
            System.out.println("Bilgileriniz hatali.");
        }
    }
}