public class _3_Problem_2 {
    public static void NumInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        NumInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        NumInc(10);
    }
}
