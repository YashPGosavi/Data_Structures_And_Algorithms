import java.io.*;
import java.util.*;

public class Solution {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int q = Integer.parseInt(firstMultipleInput[1]);
        char[] s = bufferedReader.readLine().toCharArray();

        for (int query = 0; query < q; query++) {
            String[] queryParts = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int type = Integer.parseInt(queryParts[0]);
            if (type == 1) {
                // Shift query
                int i = Integer.parseInt(queryParts[1]);
                int j = Integer.parseInt(queryParts[2]);
                int t = Integer.parseInt(queryParts[3]);
                for (int idx = i; idx <= j; idx++) {
                    s[idx] = (char) ('a' + (s[idx] - 'a' + t) % 26);
                }
            } else if (type == 2) {
                // Palindrome subset query
                int i = Integer.parseInt(queryParts[1]);
                int j = Integer.parseInt(queryParts[2]);
                int[] freq = new int[26];
                for (int idx = i; idx <= j; idx++) {
                    freq[s[idx] - 'a']++;
                }
                long result = 1;
                boolean hasOdd = false;
                for (int f : freq) {
                    if (f > 0) {
                        result = (result * (1 + f / 2)) % MOD;
                        if (f % 2 == 1) {
                            if (hasOdd) {
                                result = 0; // More than one character with odd frequency
                                break;
                            }
                            hasOdd = true;
                        }
                    }
                }
                if (result != 0) {
                    result = (result - 1 + MOD) % MOD; // Exclude the empty subset
                }
                System.out.println(result);
            }
        }
        bufferedReader.close();
    }
}



/*
    ans  = 10;
    for (int i = 0; i < 5; i++) {
        int ans += i; 
        sout(ans); 
    }


    // Dry Run

    i   0   1   2   3   4   
    ans 10  11  13  16  20
 */

 