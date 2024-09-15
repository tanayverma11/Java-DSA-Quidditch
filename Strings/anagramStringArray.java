package PW.strings;
import java.util.Arrays;
public class anagramStringArray {
    public static void main(String[] args) {
        String[] arr = { "abc", "cba", "ghh", "hgh", " lo", "lol"};
        int n = arr.length;
        findAllAnagrams(arr, n);
    }
    public static void findAllAnagrams(String[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isAnagram(arr[i], arr[j]))
                    System.out.println(arr[i] + " is anagram of " + arr[j]);
            }
        }
    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < b.length ; i++) {
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
}
