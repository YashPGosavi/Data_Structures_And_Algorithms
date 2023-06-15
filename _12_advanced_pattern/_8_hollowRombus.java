
/*
Que. HOLLOW RHOMBUS

          * * * *
        *     *
      *     *
    * * * *
 */
public class _8_hollowRombus {
    public static void pattern (int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=n;k++){
                if( i==n || k==n || i==1 || k==1){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    pattern(4);
}    
}
