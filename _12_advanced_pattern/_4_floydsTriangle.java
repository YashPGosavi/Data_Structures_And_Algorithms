/*
 Que. FLOYD'S Triangle

    1
    2 3
    4 5 6
    7 8 9 10

 */
public class _4_floydsTriangle {
    public static void pattern(int n){
        int number = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++ ){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(3);
    }
}
