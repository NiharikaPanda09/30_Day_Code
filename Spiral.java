
import java.util.*;
public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int [][] arr = new int[r][c];

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int minr =0;
        int minc=0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int te = r*c;
        int ct=0;
        while (ct<te) {
           for(int i= minr,j=minc; i<=maxr && ct<te; i++){
               System.out.println(arr[i][j]);
               ct++;

           }
            minc++;
           for(int i=maxr,j=minc;j<=maxc && ct<te;j++) {
               System.out.println(arr[i][j]);
               ct++;
           }
               maxr--;

           for(int i=maxr,j=maxc;i>=minr  && ct<te ;i--){
               System.out.println(arr[i][j]);
               ct++;
           }
            maxc--;
           for(int i=minr,j=maxc;j>=minc  && ct<te ;j--){
               System.out.println(arr[i][j]);
               ct++;

           }
            minr++;

        }

    }
}
