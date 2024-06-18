import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 6 elements");
        int [] arr = new int[6];
        for(int i=0; i< arr.length-1; i++){
            arr[i] = sc.nextInt();

        }
        int target = 1192;

        int ls = LinearSearch1(arr,target);
        System.out.println(ls);


    }
    static int LinearSearch1(int[] arr,int target){
        if(arr.length == 0)
            return -1;
        for(int i=0; i< arr.length; i++){
            int iteration = arr[i];
            if( iteration == target){
                return i;
            }
        }
        return 1;
    }
}
