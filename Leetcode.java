public class Leetcode {
    public static void main(String[] args) {
        int[] arr = {2, 7,11,15};
        int target =22;
        int ans= TwoSum(arr,target);
        System.out.println(ans);

    }
    static int TwoSum(int [] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == target ){
                    System.out.println("[" + i + "," +  j + "]");

                }
            }
        }
        return -1;
    }
}
