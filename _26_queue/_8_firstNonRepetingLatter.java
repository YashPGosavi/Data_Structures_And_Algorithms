/*
Question 4
First non-repeating Letter in a stream of characters.
(input) aabccxb
(output) a -1 b b b b x
 */

 import java.util.*;

public class _8_firstNonRepetingLatter {

    public static void nonRepeting(String str){
        int freq [] = new int[26];
        Queue<Character> q  = new LinkedList<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }

        char ch =  'd';
        System.out.println(freq[ch-'a']);
    }
    public static void main(String[] args) {
        String s = "aabccxb";
        nonRepeting(s);
    }
}
