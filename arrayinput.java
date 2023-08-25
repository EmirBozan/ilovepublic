import java.util.Scanner;
import java.util.Arrays;

public class arrayinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements : ");
        int n = input.nextInt();
        int [] givenNumbers = new int[n];
        for (int i= 0; i<n; i++){
            int number = input.nextInt();
            givenNumbers[i]=number;
        }
        Arrays.sort(givenNumbers);
        for(int j= 0; j<n; j++){
            System.out.print(givenNumbers[j]+" ");
        }
        
        
    }
}
