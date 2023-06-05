import java.util.Scanner;

public class project3 {
    public static void main (String[]args){
        int a, b, c, u;
        Scanner kenar = new Scanner(System.in);
        System.out.print("1. Kenar:");
        a = kenar.nextInt();
        System.out.print("2. Kenar:");
        b = kenar.nextInt();
        System.out.print("3. Kenar:");
        c = kenar.nextInt();
        u = (a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı:"+alan);
        

    }
}
