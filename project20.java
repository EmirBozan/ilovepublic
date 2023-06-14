import java.util.Scanner;

public class project20 {
    public static void main(String[] args) {
        int fak1=1, fak2=1, deger, cikarma, ndeger, rdeger, fak3=1;
        Scanner sayi = new Scanner(System.in);
        System.out.println("C(n,r) hesaplamak için n ve r değerlerini giriniz : ");
        System.out.print("n : ");
        ndeger = sayi.nextInt();
        for (int i=1; i<=ndeger; i++){
            fak1= fak1*i;
        }
        System.out.print("r : ");
        rdeger = sayi.nextInt();
        for (int j=1; j<=rdeger; j++){
            fak2= fak2*j;
        }
        cikarma= ndeger-rdeger;
        for (int k=1; k<=cikarma; k++){
            fak3= fak3*k;
        }
        deger= fak1/(fak2*fak3);
        System.out.println("Kombinasyon sonucu : "+deger);
    }
}
