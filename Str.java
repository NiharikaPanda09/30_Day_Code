  import java.util.*;
  import java.util.Arrays;

  public class Str {
    public static void main(String[] args) {
        String name = "niharika";
        char target= 'u';
        //System.out.println(strSearch(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean strSearch(String str, char target){
        if(str.length() == 0) {
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch == target){
                return true;
            }

        }
        return false;
        }

//    static boolean strSearch(String str, char target){
//        if(str.length() == 0){
//            return false;
//
//        }
//        for(int i=0; i<str.length();i++){
//            if(target == str.charAt(i)) {
//
//
//                return true;
//            }
//        }
//        return false;

    }


