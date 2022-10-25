import java.util.ArrayList;
import java.util.Stack;

public class Question2 {

    public static void main(String[] args) {
        int number = 0;

        ArrayList<Integer> array = new ArrayList();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);

        ArrayList<Integer> newarray = (ArrayList<Integer>) array.clone();

        int index = array.size() - 1;
        array.remove(index);
        array.add(-5);

        System.out.println("First Array List:" + array);
        System.out.println("Second Array List: " + newarray);

    

    }    
}
