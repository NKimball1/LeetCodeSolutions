class Solution {
    public int fib(int N) {
        //to store solutions
        int[] sol = new int[31];
        return f(N, sol);
    }
    public int f(int N, int sol[]) {
        
        //BC
        if (N <= 1) {
            return N;
        }
        
         //If already computed, grab from array
        if (sol[N] != 0) {
            return sol[N];
        } else {
            sol[N] = f(N - 1, sol) + f(N - 2, sol);
            return sol[N];
        }
    }
    
}