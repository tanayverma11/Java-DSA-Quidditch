package PW.strings;
import java.util.Scanner;
public class checkIsomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(isIsomorphic(s,t)) System.out.println("ISOMORPHIC");
        else System.out.println("NOT ISOMORPHIC");
    }
    public static boolean isIsomorphic(String s, String t){
        char [] s_t = new char[26];
        // checking s->t mapping
        for (int i = 0; i <s.length() ; i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            int idx = (int)sch-97;
            if(s_t[idx] == '\0') s_t[idx] = tch;
            else if(s_t[idx] != tch) return false;
        }
        char [] t_s = new char[26];
        // checking t->s mapping
        for (int i = 0; i <t.length() ; i++) {
            char sch = t.charAt(i);
            char tch = s.charAt(i);
            int idx = (int)sch-97;
            if(t_s[idx] == '\0') t_s[idx] = tch;
            else if(t_s[idx] != tch) return false;
        }
        return true;
    }
}
