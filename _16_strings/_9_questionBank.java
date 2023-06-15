/*
 Count how many times lowercase vowels occurred in a String entered by the user.
 */

// public class _9_questionBank {

//     public static void main(String[] args) {
//         String str = "aeiou";
//         int count = 0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i'|| str.charAt(i)=='o' ||str.charAt(i)=='u'){
//                 count ++;
//             }
//         }
//         System.out.println(" lowercase vowels occurred : "+ count +" times");
//     }
// }

/*
Determine if 2 Strings are anagrams of each other.
What are anagrams?
If two strings contain the same characters but in a different order, they can be said to be anagrams. consider race and care. In this case, races characters can be formed into a study or care's characters can be formed into race. Below is a java program to check if two strings
are anaarams or not
 */

public class _9_questionBank {

    public static boolean anaarams(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean isAnaarams = false;
        if (a.length() == b.length()) {
            char[] str1 = new char[a.length()];
            char[] str2 = new char[b.length()];
            for (int i = 0; i < a.length(); i++) {
                str1[i] = a.charAt(i);
                str2[i] = a.charAt(i);
            }
            sortArr(str1);
            sortArr(str2);
            if(equalArr(str1,str2)==true){
                isAnaarams = true;
            }
        }
        return isAnaarams;
    }

    public static void sortArr(char[] str) {
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (str[j] > str[j + 1]) {
                    char temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
    }

    public static boolean equalArr(char[] str1,char[] str2) {
        boolean isequal = false;
        for (int i = 0; i < str1.length - 1; i++) {
            if(str1[i]==str2[i]){
                isequal =  true;
            }else{
                isequal =  false;
            }
        }
        return isequal;
    }
    
    public static void main(String[] args) {
        String a = "cares";
        String b = "races";
        System.out.println(anaarams(a,b));
    }
}
