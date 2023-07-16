import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class project30 {
    public static void main(String[] args) {
        int sayac = 0, sayac1 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int sayi = input.nextInt();
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println(sayi + " asal sayıdır.");
        } else {
            System.out.println("Asal değil.");
        }
        for (int k = 2; k < 100; k++) {
            for (int j = 2; j < k; j++) {
                if (k % j == 0) {
                    sayac1++;
                }
            }
            if (sayac1 == 0) {
                System.out.print(k + ", ");
            }
        }
    }

}
