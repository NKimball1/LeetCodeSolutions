class Solution {
    public int climbStairs(int n) {
    int[] sol = new int[1000];
    return f(n, sol);
    
    }
    public int f(int n, int sol[]) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        if (sol[n] != 0) {
            return sol[n];
        } else {
             sol[n] = f(n - 1, sol) + f(n - 2, sol);
             return sol[n];
        }
        
    }
}