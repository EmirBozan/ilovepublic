import java.util.Scanner;

public class project8 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sayi = new Scanner(System.in);
        System.out.println("1. Toplama işlemi");
        System.out.println("2. Çıkarma işlemi");
        System.out.println("3. Çarpma işlemi");
        System.out.println("4. Bölme işlemi");
        System.out.println("İstediğiniz işlemi seçiniz:");
        a = sayi.nextInt();
        switch (a) {
            case 1:
                System.out.print("İlk sayiyi giriniz : ");
                b = sayi.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                c = sayi.nextInt();
                d = b + c;
                System.out.println(d);
                break;
            case 2:
                System.out.print("İlk sayiyi giriniz : ");
                b = sayi.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                c = sayi.nextInt();
                d = b - c;
                System.out.println(d);
                break;
            case 3:
                System.out.print("İlk sayiyi giriniz : ");
                b = sayi.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                c = sayi.nextInt();
                d = b * c;
                System.out.println(d);
                break;
            case 4:
                System.out.print("İlk sayiyi giriniz : ");
                b = sayi.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                c = sayi.nextInt();
                d = b / c;
                System.out.println(d);
                break;
            default:
                System.out.println("1 ile 4 arası bir değer giriniz.");
                return;
        }
    }
}
