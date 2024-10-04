package Recursion;
public class SkipCharacter {

    private static void skip(int i, String s, String ans){  //T.C. = O(n)
        if(i==s.length()) {
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!='a')  skip(i+1, s, ans+s.charAt(i));
        else skip(i+1, s, ans);
    }

    public static void main(String[] args) {
        String str = "Tanay Verma";
        skip(0, str, "");
    }
}
