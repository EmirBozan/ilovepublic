import java.util.Scanner;
public class project2 {
    public static void main (String[]args){
        double fiyat, sonfiyat;
        Scanner tutar = new Scanner(System.in);
        System.out.print("KDV'siz fiyat: ");
        fiyat = tutar.nextDouble();
        sonfiyat = fiyat*1.18;
        System.out.println("KDV'li fiyat: "+sonfiyat);
    }
}
