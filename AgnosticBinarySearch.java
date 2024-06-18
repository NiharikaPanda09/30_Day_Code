import java.util.*;
public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,6,8,90};
        int target = 8;
        int ans = ABS(arr,target);
        System.out.println(ans);

    }

    static int ABS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean Asc = start < end;
        while(start<= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(Asc){
                if(target > arr[mid]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }

            } else if (target < arr[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }

            }
        return -1;

        }

    }
