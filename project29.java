import java.util.Scanner;

public class project29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Basamak sayısını giriniz : ");
        sayi = input.nextInt();
        for(int i=0; i<sayi;i++){
            for(int j=0; j<=i;j++){
                System.out.print(" ");
            }    
            System.out.println();
            for(int k=2*(sayi)-1;k>=(2*i+1);k--){
                System.out.print("*");
            }
        }
    }
}
