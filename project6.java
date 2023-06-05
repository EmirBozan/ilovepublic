import java.util.Scanner;

public class project6 {
    public static void main(String[] args) {
        double boy, kg, yas, kitlend;
        System.out.print("Boyunuzu santimetre cinsinden giriniz:");
        Scanner sayi = new Scanner(System.in);
        boy = sayi.nextDouble();
        System.out.print("Kg cinsinden kilonuzu giriniz:");
        kg = sayi.nextDouble();
        System.out.print("Yaşınızı giriniz:");
        yas = sayi.nextDouble();
        boy = boy/100;
        kitlend = kg/(boy*boy);
        System.out.print("Vücut kitle endeksiniz:"+kitlend);
    }
}
