
public class _3_palindrome{

    public static boolean palindrome(String a){
        boolean palindrome = false;
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)==a.charAt(a.length()-i-1)){
                System.out.println(a.charAt(i)+"  "+a.charAt(a.length()-i-1));
                palindrome = true;
            }else{
                return false;
            }
        }
        return palindrome;
    }
    public static void main(String[] args) {
        String pal = "nitin";
        System.out.println(palindrome(pal));
    }
}