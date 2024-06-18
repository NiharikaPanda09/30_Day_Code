import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> food = new ArrayList();
        food.add("cheeseBurger");
        food.add("iceCream");
        food.add("gupchup");
        Iterator<String> it = food.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }

}