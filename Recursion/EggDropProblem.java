package Recursion;

import java.util.Scanner;

public class EggDropProblem {
    //Primary Intuition : NthStair1or2or3jump
    //Unoptimised Approach, has T.C. = O(2^N) , S.C. = O(N)
    //Can be optimised using the following:-
    //Memoization Approach: T.C. = O(E*F) , S.C. = O(E*F)
    //Dynamic Programming Approach: T.C. = O(E*F) , S.C. = O(E*F)

    private static int helper(int eggs, int floors){
        if(floors==0 || floors==1){
            return floors;
        }
        if(eggs==1){
            return floors;
        }
        int currDrops;
        int minDrops = Integer.MAX_VALUE;
        for(int i=1; i<=floors; i++){
            currDrops = 1 + Math.max(helper(eggs-1, i-1) , helper(eggs, floors-i));
            minDrops = Math.min(currDrops, minDrops);
        }
        return minDrops;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eggs=sc.nextInt();
        int floors=sc.nextInt();
        System.out.println(helper(eggs,floors));
        sc.close();
    }
}
