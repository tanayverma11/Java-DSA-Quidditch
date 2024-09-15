package BinarySearch;

public class BinarySearchDescending {
    public static void main(String[] args) {
        int [] arr={9,8,7,6,5,4,3,2,1,0};
        int n=arr.length;
        int x=14;
        bSearchDesc(arr,n,x);
    }
    public static void bSearchDesc(int[] arr, int n, int x) {
        int lo=n-1, hi=0,mid=0;
        boolean flag=false;
        while(lo>=hi){
            mid = hi + (lo-hi)/2;
            if(arr[mid]==x){
                flag=true;
                break;
            }
            else if(arr[mid] > x)  hi=mid+1;
            else lo=mid-1;
        }
        if(flag) System.out.println("Element Found");
        else System.out.println("Not Found!");
    }
}
