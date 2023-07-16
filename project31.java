import java.util.Scanner;

public class project31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fibo1=0, fibo2=1, fibo3, seri;
        System.out.print("Fibonacci eleman sayısını giriniz : ");
        seri = input.nextInt();
        System.out.print(fibo1+", "+fibo2);
        for(int i=2;i<seri;i++){
            fibo3=fibo1+fibo2;
            System.out.print(", "+fibo3);
            fibo1=fibo2;
            fibo2=fibo3;
        }
    }
}
