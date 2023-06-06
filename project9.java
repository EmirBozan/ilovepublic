import java.util.Scanner;

public class project9 {
    public static void main(String[] args) {
        int sifre = 123456, a, b;
        Scanner sayi = new Scanner(System.in);
        System.out.print("Şifrenizi giriniz : ");
        a = sayi.nextInt();

        if (a==sifre){
            System.out.println("Başarıyla giriş sağlandı.");
        }
        else {
            System.out.println("Girdiğiniz şifre yanlış. Şifrenizi sıfırlayınız.");
            System.out.print("Yeni şifre : ");
            b = sayi.nextInt();
            if (b==sifre){
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }
            else {
                System.out.println("Şifre oluşturuldu.");
            }
        }   
    }
}
