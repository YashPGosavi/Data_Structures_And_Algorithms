/*
 Recursive Algorithms :- 
                    1. Linear Recursion
                    2. Divide And Conqure

    For Linear to find Time and Space complexity we use :-
                        Total work done = (no of calls * work in each call)

    Recurrence Equation
                        Space Complexity = (max depth * memory in each call)
 */
public class _3_cheakingTimeCoplexity {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i < n; i++) { // Time Complexity --> O(n)
            // some contant work is done in this loop
        }

        // * Nested Loop 1 --> Time Complexity --> O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // some constant work is done in this loop
            }
        }

        // * Nested Loop 2 --> Time Complexity --> O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // some constant work is done in this loop
            }
        }

        int k = 3;

        // * Nested Loop 3 --> Time Complexity --> O(n^2)
        for (int i = 0; i < n; i = 1 + k) {
            for (int j = i + 1; j <= k; j++) {
                // some constant work /is done in this loop
            }
        }

    }

    // * For factorial --> O(n)
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    // * For sum of n --> TC = O(n) ; SC = O(n)
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    
}

    // * Fibonacci --> TC = O(n^2) ; SP = (n)
     class fibonacci {
        static int fib(int n) {
            if (n == 0 || n == 1) {
                return n;
            }
            return fib(n - 1) + fib(n - 2);
        }
    }