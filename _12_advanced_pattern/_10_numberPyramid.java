/*
Que. Number pyramid

        1
       2 2
      3 3 3
     4 4 4 4

 */
public class _10_numberPyramid {
    public static void pattern (int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
