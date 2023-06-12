import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class project14 {
    public static void main(String[] args) {
        int yas, secenek;
        double fiyat, mesafe;
        Scanner sayi = new Scanner(System.in);
        System.out.print("Yaşınız : ");
        yas = sayi.nextInt();
        System.out.print("Uçuş mesafesini giriniz : ");
        mesafe = sayi.nextDouble();
        fiyat = mesafe*0.1;
        if (0 < yas) {
            if (yas < 12) {
                fiyat= fiyat*0.5;
                System.out.println("Ücret : "+fiyat);
            }
            else if (12<=yas && yas<=24){
                fiyat= fiyat*0.9;
                System.out.println("Ücret : "+fiyat);
            }
            else if (65<yas){
                fiyat= fiyat*0.7;
                System.out.println("Ücret : "+fiyat);
            }
            else {
                System.out.println("Ücret : "+fiyat);
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    System.out.println("Biletiniz gidiş-dönüş olacak mı?");
    System.out.println("1. Evet             2. Hayır");
    secenek = sayi.nextInt();
    if (0==secenek){
        System.out.println("Ücret : "+fiyat);
    }
    else if (1==secenek){
        fiyat= fiyat*0.8;
        System.out.println("İndirimli Ücret : "+fiyat);
    }
    }

}
