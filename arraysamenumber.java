import java.util.Arrays;

public class arraysamenumber {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 1, 1, 1, 7, 8, 4, 23, 5, 46745, 1234, 123, 1234, 13, 13 };
        // int[] newArray;
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            if (arr[i]==arr[i++]){
                if(arr[i]%2==0){
                    System.out.println(arr[i]+" , ");
                }
            }
            
        }

    }
}