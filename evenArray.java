import java.util.*;
public class evenArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,3,90,87,60};
        System.out.println(max(arr,1,4));

    }
    static int max(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i =0; i<=end; i++){

            if(arr[i] > maxVal)
                maxVal = arr[i];

        }
        return maxVal;


    }
}
