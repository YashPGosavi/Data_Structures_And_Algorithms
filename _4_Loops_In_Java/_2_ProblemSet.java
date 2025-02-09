import java.util.Scanner;

//Que :- find the sum of all even numbers upto 1-n

public class _2_ProblemSet {
    public static void main(String[] args){
        int i=2,n,ans=0;
        System.out.println("Enter No. : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(i<=n){
            ans+=i;        
            i=i+2;
        }
        System.out.println(ans);
        sc.close();
    }
}
