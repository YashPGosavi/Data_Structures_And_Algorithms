/*
Find & print all subsets of a given string

    If string length is "n" then total number of subset is "2^n".

    TC --> O(n*n^2)
    SP --> O(n)
 */
public class _3_findSubset {
    public static void findSubstring(String str, String ans,int i){

        //base
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        //Yes
        findSubstring(str, ans+str.charAt(i), i+1);

        //No
        findSubstring(str, ans, i+1);

    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        findSubstring(str,ans,0);
    }
    
}
