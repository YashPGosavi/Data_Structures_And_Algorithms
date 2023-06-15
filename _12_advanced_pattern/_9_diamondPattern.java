/*
Que. DIAMOND Pattern

         *
       * * *
     * * * * *
   * * * * * * *
   * * * * * * *
    * * * * * *
       * * *
         * 
 */

public class _9_diamondPattern {
    public static void pattern (int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("* ");
            }
    
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=i;j<=n-1;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("* ");
            }
    
            System.out.println();
        }
    }
        public static void main(String[] args) {
            pattern(5);
        
    }
}
