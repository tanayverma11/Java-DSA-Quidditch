package Strings;
public class StringCompression {
    public static void main(String[] args) {
        String s = "aaaabbbbcccdeffghttyyzzz";
        char[] arr = s.toCharArray();
        System.out.println(compress(arr));
    }
    public static int compress(char[] arr){
        StringBuilder ans = new StringBuilder("") ;
        int i=0, j=0;
        while(j < arr.length){
            if(arr[j] == arr[i]) j++;
            else {
                ans.append(arr[i]);
                if(j-i>1) ans.append(j-i);
                i=j;
            }
        }
        ans.append(arr[i]);
        if(j-i>1) ans.append(j-i);

        //  System.out.println(ans);   // a4b4c3def2ght2y2z3
        for (int k = 0; k < ans.length() ; k++)
            arr[k] = ans.charAt(k);
        return ans.length();
    }
}
