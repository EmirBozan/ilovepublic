import java.util.Scanner;

public class project22 {
    public static void main(String[] args) {
        int toplam=0, deger1;
        Scanner sayi = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        deger1= sayi.nextInt();
        while (deger1!=0){
            toplam+=deger1%10;
            deger1=deger1/10;
        }
        System.out.println(toplam);
}
}
