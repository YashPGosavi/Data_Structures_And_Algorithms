import java.util.Scanner;
/* 
Pattern Printing
1)  * * *        2)  * * * *         3)  * * * * *
    * * *            * * * *             * * * * *
    * * *            * * * *             * * * * *
                     * * * *             * * * * *
                                         * * * * *

public class _1_pattern{
    public static void main(String[] args){
        System.out.println("Enter no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
} 
*/


/* Pattern Printing
1)  1 2 3        2)  1 2 3 4         3)  1 2 3 4 5
    1 2 3            1 2 3 4             1 2 3 4 5
    1 2 3            1 2 3 4             1 2 3 4 5
                     1 2 3 4             1 2 3 4 5
                                         1 2 3 4 5
 

 public class _1_pattern{
    public static void main(String[] args) {
        System.out.println("Enter no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
        for(int j=1; j<=n;j++){
            System.out.print(j+ " ");
        }
        System.out.println(" ");
        }
    }
 }
 */


/* Pattern Printing
1)  1 1 1        2)  1 1 1 1         3)  1 1 1 1 1
    2 2 2            2 2 2 2             2 2 2 2 2
    3 3 3            3 3 3 3             3 3 3 3 3
                     4 4 4 4             4 4 4 4 4
                                         5 5 5 5 5

 public class _1_pattern{
    public static void main(String[] args) {
        System.out.println("Enter no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
        for(int j=1; j<=n;j++){
            System.out.print(i+ " ");
        }
        System.out.println(" ");
        }
    }
 }
*/



/*
1)  1       2)  1        3) 1
    1 2         1 2         1 2
                1 2 3       1 2 3
                            1 2 3 4              


 public class _1_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
 }


 /* 
    1)  A A A         2)  A A A A
        B B B             B B B B
        C C C             C C C C
                          D D D D
*/
public class _1_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        char a='A';
   for(int i=0;i<n;i++){
     a = (char) (a+(i));
    for(int j=0;j<n;j++){
        System.out.print(a+ " ");
    }
    System.out.println();
     sc.close();
   }

    
    }
}