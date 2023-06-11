import java.util.Scanner;

public class project10 {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz;
        Scanner sayi = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriiniz : ");
        mat = sayi.nextInt();
        System.out.print("Fizik notunuzu giriiniz : ");
        fiz = sayi.nextInt();
        System.out.print("Türkçe notunuzu giriiniz : ");
        tur = sayi.nextInt();
        System.out.print("Kimya notunuzu giriiniz : ");
        kim = sayi.nextInt();
        System.out.print("Müzik notunuzu giriiniz : ");
        muz = sayi.nextInt();
        if (0 > mat || mat > 100 || 0 > fiz || fiz > 100 || 0 > tur || tur > 100 || 0 > kim || kim > 100
                || 0 > muz || muz > 100) {
            System.out.println("Lütfen 0 ile 100 arası bir değer giriniz.");

        } else {
            double b = (mat + fiz + tur + kim + muz) / 5.0;
            if (55 <= b) {
                System.out.println("Tebrikler sınıfı geçtiniz ve notunuz : " + b);
            } else {
                System.out.println("Sınıfı geçemediniz ve notunuz : " + b);
            }
        }

    }
}
