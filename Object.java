
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num =1;


        for (int i = 0; i < n; i++) {
            System.out.print(sum + " ");
            int next = sum+ num;
            sum= num;
            num = next;


        }

    }
}
