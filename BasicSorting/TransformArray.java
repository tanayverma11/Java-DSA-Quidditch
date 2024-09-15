package BasicSorting;
public class TransformArray {
    public static void main(String[] args) {
        int[] a = {40, 12, 78, 34, 100, 57, 23};
        //output => 3   0   5   2   6    4   1
        int n = a.length;
        int x = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int min_idx = -1;
            for (int j = 0; j < n; j++) {
                if(a[j] < min && a[j] > 0){
                    min = a[j];
                    min_idx = j;
                }
            }
            a[min_idx] = x;
            x--;
        }
        //printing
        for (int j : a) System.out.print(j * (-1) + " ");
    }
}
