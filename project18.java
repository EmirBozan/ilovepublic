import java.util.Scanner;

public class project18 {
    public static void main(String[]args) {
        int girdi, toplam = 0;
        Scanner sayi = new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz : ");
            girdi = sayi.nextInt();
            if (girdi %4 == 0) {
                toplam += girdi;
                
            }   
        } while (girdi%2==0);
        System.out.print("Toplam : "+toplam);
}
}
