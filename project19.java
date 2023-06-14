import java.util.Scanner;

public class project19 {
    public static void main(String[] args) {
        int deger;
        Scanner sayi = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        deger = sayi.nextInt();
        for (int i=1; i<=deger; i++){
            if(i%4==0){
            System.out.print(i+", ");
            }
            else if (i%5==0){
            System.out.print(i+", ");
            }
        }

    }
}
