import java.util.Scanner;

public class project17 {
    public static void main(String[] args) {
        int oniki, toplam=0 , kacsayi=0;
        double ortalama=0;
        Scanner sayi = new Scanner(System.in);
        System.out.print("İstediğiniz Sayıyı Giriniz : ");
        oniki = sayi.nextInt();
        for (int i=1 ; i<=oniki; i++){
            if(i%12==0){
                kacsayi++;
                toplam+=i;
            }
        }
        ortalama=toplam/kacsayi;
        System.out.println("Ortalama : "+ortalama);
    }
}