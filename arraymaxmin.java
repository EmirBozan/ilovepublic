import java.util.Scanner;

public class arraymaxmin {
    public static void main (String[]args){ 
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the target number : ");
        int targetNumber = input.nextInt();
        int closestMin = findMinClosestNumber(array, targetNumber); 
        int closestMax = findMaxClosestNumber(array, targetNumber);
        System.out.println("Closest min number is : "+closestMin);
        System.out.println("Closest max number is : "+closestMax);


    }
        static int findMinClosestNumber (int[] array, int targetNumber){
            int minValue = Integer.MIN_VALUE;
            for (int number:array){
                if (minValue<number && number<targetNumber){
                    minValue = number;
                }
            } return minValue;
        }
        static int findMaxClosestNumber (int[] array, int targetNumber){
            int maxValue = Integer.MAX_VALUE;
            for (int number:array){
                if (maxValue>number && number>targetNumber){
                    maxValue = number;
                }
            }
            return maxValue;
        }
        
        

   
}
