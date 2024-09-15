package Stacks;
import java.util.Stack;
public class PushAtAnyIndex {  // T.C. = O(n) , S.C. = O(n)
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);
        System.out.println(st_original);
        int new_element = 99;
        int pos = 2;
        Stack<Integer> st_temp = new Stack<>();
        while(st_original.size() >= pos) st_temp.push(st_original.pop());
        st_original.push(new_element);
        while(!st_temp.isEmpty()) st_original.push(st_temp.pop());
        System.out.println(st_original);
    }
}
