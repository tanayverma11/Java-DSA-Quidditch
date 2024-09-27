package CollectionsFramework;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        //add elements
        list.add(10);
        list.add(15);
        list.add(19);
        System.out.println(list);

        //get elements
        int ele = list.get(2);
        System.out.println(ele);

         //add ele in between
        list.add(1, 40);
        System.out.println(list);

        //set element
        list.set(0,60);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
