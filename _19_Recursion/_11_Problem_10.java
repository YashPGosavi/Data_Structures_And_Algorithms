/*
Problem 11
Tiling Problem
Given a "2 x n" board and tiles of size "2 × 1", count the number of ways to tile the given board using the 2 x 1 tiles.
(A tile can either be placed horizontally or vertically.)
 */
public class _11_Problem_10 {
    public static int tileProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int vertical = tileProblem(n - 1);
        int horizontal = tileProblem(n - 2);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        System.out.println(tileProblem(3));
    }
}
