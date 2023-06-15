/*
Grid ways
Find number of ways to reach from (0,0) to (N-1, M-1) in a NxM Grid.
Allowed moves - right or down.

TC --> O(2^n+m)
SC --> 

Mathematical Formula --> 
                (n-1 + m-1)
                ------------
                (n-1)!(m-1)!
 */
public class _6_gridWays{
    public static int findGridyWays(int i, int j, int n, int m){
    
        // base
        if(i==n-1&& j==m -1){ //condn for last cell
            return 1;
        }else if(i==n || j==m){ //boundary cross condn
            return 0;
        }

        // recursion
        int W1 = findGridyWays(i+1, j, n, m);
        int W2 = findGridyWays(i, j+1, n, m);
        return W1+W2;
    }
    public static void main(String[] args) {
        int n=3, m = 3;
        System.out.println(findGridyWays(0, 0, n, m));
    }
}
