public class _13_Problem_13 {
    public static int friendsPairing(int n) {

        // Base
        if (n == 1 || n == 2) {
            return n;
        }

        // single
        int single = friendsPairing(n - 1);

        // Pair
        int pair = (n - 1) * friendsPairing(n - 2);

        int total_wayss = single + pair;

        return total_wayss;

        /*
         * Or we can Write
         return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
         */

    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }

}
