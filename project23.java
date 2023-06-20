import java.util.Scanner;
public class project23 {
    public static void main(String[]args) {
        double sayi, toplam=0,deger;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();
        for(double i=1;i<=sayi;i++){
            deger=(1/i);
            System.out.print(deger+", ");
            toplam+=deger;
        }
        System.out.println("Sonuç : "+toplam);
    }
}
