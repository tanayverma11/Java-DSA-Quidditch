package Strings;
public class MaxValue {
    public static void main(String[] args) {
        String[] str = {"3422435","45432135676856","-654464","009","09","0000"};
        String maxS = str[0];
        for (int i = 1; i < str.length; i++)
            maxS = findMax(maxS,str[i]);
        System.out.println(maxS);
    }
    public static String purify(String s){
        for (int i = 0; i < s.length(); i++)
            if(s.charAt(i) != '0') return s.substring(i);
        return s;
    }
    public static String findMax(String a, String b){
        String s = purify(a), t = purify(b);
        if(s.length()>t.length()) return a;
        if(t.length()>s.length()) return b;
        for(int i=0; i<s.length();i++) {
            if ((s.charAt(i) != t.charAt(i)) && (s.charAt(i) > t.charAt(i))) return a;
            else return b;
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }
}
