import java.util.Scanner;
public class project24 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç taneden oluşsun : ");
        int n = input.nextInt(); 
        for(int i=3;i<=n;i+=2){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=3;j<=i+2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=3;i<=n;i+=2){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
