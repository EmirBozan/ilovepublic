import java.util.Scanner;

public class project26 {
    public static void main(String[]args) {
        int sayi1, sayi2, ebob=1, ekok=1;
        Scanner input= new Scanner(System.in);
        System.out.print("Küçük sayıyı giriniz : ");
        sayi1= input.nextInt();
        System.out.print("Büyük sayıyı giriniz : ");
        sayi2= input.nextInt();
        for(int i=2; i<=sayi1; i++){
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
            
        }
        System.out.println("ebob : "+ebob);
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("ekok : "+ekok);
    }
}
