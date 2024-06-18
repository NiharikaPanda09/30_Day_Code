import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // ArrayList <Integer> list = new ArrayList <>(10);
//        list.add(45);
//        list.add(58);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
//        for(int i=0;i<5; i++){
//            list.add(sc.nextInt());
//
//        }
//        for(int i=0; i<5; i++){
//            System.out.println(list.get(i));
//        }
        ArrayList <ArrayList<Integer>> list = new ArrayList<>();
         for(int i=0; i<3 ; i++){
             list.add(new ArrayList<>());
         }
         for(int i =0; i<3; i++){
             for(int j=0; j<3; j++){
                 list.get(i).add(sc.nextInt());
             }
         }
        System.out.println(list);

    }
}
