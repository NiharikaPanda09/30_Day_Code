import java.util.Arrays;
import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void Cyclic(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }

        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
       arr[second] = temp;
    }


}
