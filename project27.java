import java.util.Scanner;

public class project27 {
    public static void main(String[] args) {
        int kactane, sayi;
        int maxsayi = Integer.MIN_VALUE;
        int minsayi = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.print("kaç tane sayı olacak : ");
        kactane = input.nextInt();
        for (int i = 1; i <= kactane; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            sayi = input.nextInt();
            if(sayi>maxsayi){
                maxsayi=sayi;
            }
            if(sayi<minsayi){
                minsayi=sayi;
            }
        }
        System.out.println("max : "+maxsayi+"\nmin : "+minsayi);
    }
}
