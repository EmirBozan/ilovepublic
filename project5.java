import java.util.Scanner;

public class project5 {
    public static void main(String[] args) {
        int r, aci;
        double p = 3.14, alan;
        Scanner sayi = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz:");
        r = sayi.nextInt();
        System.out.print("Açıyı giriniz:");
        aci = sayi.nextInt();
        alan = (p*r*r)*aci/360;
        System.out.print("Alan:"+alan);
        
    }
}
