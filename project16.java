import java.util.Scanner;

public class project16 {
    public static void main(String[] args) {
        int artikyil;
        Scanner sayi = new Scanner(System.in);
        System.out.print("Yılı giriniz : ");
        artikyil = sayi.nextInt();
        if (artikyil%4==0){
            if (artikyil%100==0){
                if (artikyil%400==0){
                    System.out.println("Artık yıldır : "+artikyil);
                }
                else {
                    System.out.println("Artık yıl değil : "+artikyil);
                }
            }
            else {
                System.out.println("Artık yıldır : "+artikyil);
            }
        }
        else {
            System.out.println("Artik yil değil : "+artikyil);
        }
    }
}
