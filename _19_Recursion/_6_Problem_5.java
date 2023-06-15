/*
 
Problem 5
Print Nth fibonacci number.

 */
public class _6_Problem_5 {
    public static int printFib(int n){
        if(n==0||n==1){
            return n;
        }
        return printFib(n-1)+printFib(n-2);
    }

    static int a =0;
    static int b =1;
                                                                 
    public static void printFibbSeries(int n){
        int sum = a + b;
        if(n==2){
             sum = n;
             return;
        }
         System.out.print(sum+" ");
         a=b;b=sum;
        printFibbSeries(n-1);
        
    }
    public static void main(String[] args) {
       System.out.println(printFib(10));

        System.out.print(0+" "+1+" ");
        printFibbSeries(11);
    }
}
