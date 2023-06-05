import java.util.Scanner;

public class project4 {
    public static void main(String[] args) {
        double tutar;
        Scanner sayi = new Scanner(System.in);
        System.out.print("Kilometreyi giriniz:");
        double km = sayi.nextDouble();
        tutar= (km*2.2+10);
        System.out.print("Taksimetre:"+tutar);
        
    }
}
