/*  
Que. 1 Print HOLLOW RECTANGLE pattern

    * * * * *
    *       *
    *       *
    * * * * *
    
*/

public class _1_hollowRactangle{
    public static void pattern(int n, int m){
        for(int i=1;i<=n;i++){ // columns
            for(int j=1;j<=m;j++){ // rows
                if(i==n || j==m || i==1 || j==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4,5);
    }
}