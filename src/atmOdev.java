import java.util.Scanner;

public class atmOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanici Adiniz :");
            userName = input.nextLine();
            System.out.print("Sifreniz :");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
            do {
                    System.out.println("1- Para Yatirma\n" +
                            "2- Para Cekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Cikis");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Para miktari : ");
                        int price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Para miktari : ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                }
                } while (select != 4);
                System.out.print("Tekrar gorusmek uzere.");
                break;
            } else {
                right--;
                System.out.println("Kullanici adiniz ve sifreniz hatali. Lutfen tekrar deneyiniz.");
                if (right == 0) {
                    System.out.print("Hesabiniz bloke olmustur. Lutfen bankaniz ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan hakkiniz : " + right);
                }
            }
        }
    }
}