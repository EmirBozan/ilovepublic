import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        double mat, fiz, kim, tar, muz, avg;
        Scanner not = new Scanner(System.in);
        System.out.print("Matematik notunuz:");
        mat = not.nextDouble();
        System.out.print("Fizik notunuz:");
        fiz = not.nextDouble();
        System.out.print("Kimya notunuz:");
        kim = not.nextDouble();
        System.out.print("Tarih notunuz:");
        tar = not.nextDouble();
        System.out.print("Müzik notunuz:");
        muz = not.nextDouble();
        avg = (mat + fiz + kim + tar + muz) / 5;
        boolean cond1 = (avg>=60);
        System.out.println(cond1? "Geçtiniz ve notunuz:"+avg : "Geçemediniz ve notunuz:"+avg);
    }
}
