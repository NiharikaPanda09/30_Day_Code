import java.util.*;
public class LeetcodeCeilingProblem {
    public static void main(String[] args) {
        int [] arr ={2,3,5,9,14,16};
        int target = 15;


    }
    static int nextGreatestLetter(int [] letters, int target){

        int start =0;
        int end = letters.length-1;
        while(start <= end){
            int mid= start +(end- start) /2;
            if(target >= letters[mid]){
                start =mid+1;

            } else  {
                end = mid-1;

            }
        }
        return letters[start % letters.length];

    }
}


