package BinarySearch;
public class FirstLastPosition {
    public static void main(String[] args) {
            int[] arr = {1,4,5,66,96,96,96,256,368,368,1021};
            int n = arr.length;
            int lb = n;
            int ub = n;
            int lo = 0, hi = n-1;
            int target = 96;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                if (arr[mid] >= target){
                    lb=Math.min(lb,mid);
                    hi=mid-1;
                }
                else lo=mid+1;
            }
            System.out.println(lb);
        lo = 0;
        hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid] > target){
                ub=Math.min(ub,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(ub);
        }
    }

