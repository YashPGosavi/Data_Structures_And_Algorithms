/*
Que. PALINDROMIC Pattern with Numbers

        1
      2 1 2
    2 3 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

 */
public class _11_palindromicPattern {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            for(int l=2; l<=i ;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }    
}
