//https://leetcode.com/problems/fibonacci-number/?envType=study-plan&id=level-1

class Solution {
    public int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int[] Fibonacci = new int[n+1];
        Fibonacci[0] = 0;
        Fibonacci[1] = 1;
        for(int i = 2; i < n+1; i++)
            Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
        return Fibonacci[n];
    }
}