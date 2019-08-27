class Solution {
    public int fib(int N) {
        //to store solutions
        int[] sol = new int[31];
        
        
        //BC
        if (N <= 1) {
            return N;
        }
        
        //If already computed, grab from array
        if (sol[N] != 0) {
            return sol[N];
        } else {
            sol[N] = fib(N - 1) + fib(N - 2);
            return sol[N];
        }
        
        
    }
}