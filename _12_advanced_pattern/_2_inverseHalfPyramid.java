/*
Que.2 INVERTED & ROTATED HALF-PYRAMID
    *
   **
  ***
 ****
 
*/

public class _2_inverseHalfPyramid {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){ // Column

            //Spaces
            for(int j=n;j>i;j--){ 
                System.out.print("  ");
            }

            //Rows
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
