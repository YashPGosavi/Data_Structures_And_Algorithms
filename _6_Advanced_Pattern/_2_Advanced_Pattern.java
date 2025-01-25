/*
 Q.10) Butterfly
     
     *      *
     **    **
     ***  ***
     ********
     ********
     ***  ***
     **    **
     *      *
     
    
 */
// public class _2_Advanced_Pattern {
//     public static void main(String[] args) {
//     int n=4;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         for(int l=1;l<=2*(n-i);l++){
//             System.out.print(" ");
//         }
//         for(int k=i;k>=1;k--){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// 
//     lower
//     for(int i=n;i>=1;i--){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         for(int l=1;l<=2*(n-i);l++){
//             System.out.print(" ");
//         }
//         for(int k=i;k>=1;k--){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// //     }
// // }

/*
 Q.11)Solid Rombhus
    *****
   *****
  *****
 *****
*****
 */
// public class _2_Advanced_Pattern{
//      public static void main(String[] args) {
//           int n=5;
//           for(int i=1;i<=n;i++){
//                for(int k=n-1;k>=i;k--){
//                     System.out.print(" ");
//                }
//                for(int j=1;j<=n;j++){
//                     System.out.print("*");
//                }
//                System.out.println();
//           }
//      }
//  }

/*
 Q.12) Number Pyramid.
           1
          2 2
         3 3 3
        4 4 4 4
 */
// public class _2_Advanced_Pattern{
//      public static void main(String[] args) {
//           int n=4;
//           for(int i=1;i<=n;i++){
//                for(int k=n;k>=i;k--){
//                     System.out.print(" ");
//                }
//                for(int j=1;j<=i;j++){
//                     System.out.print(i+" ");
//                }
//                System.out.println();
//           }
//      }
// }

/*
 Q.13) Palendromic number paramid.
               1
             2 1 2 
           3 2 1 2 3
         4 3 2 1 2 3 4
  */
public class _2_Advanced_Pattern{
     public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int l=2;l<=i;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
     }
}

/*
 Q.14) Diamond.
      * 
    * * * 
  * * * * * 
* * * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 

 */

//  public class _2_Advanced_Pattern{
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int k=1;k<=n-i;k++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         for(int i=n;i>=1;i--){
//             for(int k=1;k<=n-i;k++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//  }

/*
 Q.15) Hollow Butterfly.

     *      *
     **    **
     * *  * *
     *  **  *
     *  **  *
     * *  * *
     **    **
     *      *
 */

//  public class _2_Advanced_Pattern{
//     public static void main(String[] args) {
//         int n=4;

//         //Upper Level
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if(i==j||j==1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             for(int k=1;k<=2*(n-i);k++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 if(i==j||j==1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//         //Lower Level
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 if(i==j||j==1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             for(int k=1;k<=2*(n-i);k++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 if(i==j||j==1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//  }

/*
 Q.16) Hollow Rombhos.
  
    *****
   *   *
  *   *
 *   *
*****

 */

// public class _2_Advanced_Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int k=1;k<=n-i;k++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 if(i==1||i==n||j==1||j==n){
//                 System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


/*
 Q.17) Pascal's Triangle.

       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1

   n
    C  = n! / r! * (n-r)!
     r
 */

//  public class _2_Advanced_Pattern{
//   public static int fact(int n){
//     int fact=1;
//     for(int i=1;i<=n;i++){
//       fact=fact*i;
//       if(fact==0){
//         return 1;
//       }else{
//       return fact; }
//     }
//     return fact;
//   }
//   public static int coef(int n,int r){
//     int coef = fact(n)/(fact(r)*fact(n-r));
//     return coef;
//   }
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=0;i<=n;i++){
//             for(int k=0;k<=n-i;k++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<=i;j++){
//                     System.out.print(coef(i,j)+" ");
//             }
//             System.out.println();
//         }
//     }
//  }

/*
 Q.18) Half Pyramid.
         
         1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5 

 */

// public class _2_Advanced_Pattern{
//     public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=n;i++){
//         for(int k=1;k<=n-i;k++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//        }
//     }
// }

/*
 Q.19) Inverted Half Pyramid.
      
     1 1 1 1 1
      2 2 2 2
       3 3 3
        4 4
         5
 */

//  public class _2_Advanced_Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n;i>=1;i--){
//             for(int k=1;k<=n-i;k++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(i+" ");
                
//             }
//             System.out.println();
//         }
//     }
//  }