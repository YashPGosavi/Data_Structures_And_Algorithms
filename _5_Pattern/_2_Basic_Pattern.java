/*
 
Q.1) * * * * *
     * * * * *
     * * * * *
     * * * * *
 */
// public class _2_Basic_Pattern {
//     public static void main(String[] args) {
//         int n=4;
//         int m=5;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//             System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
    
// }

/*
 Q.2) * * * * *
      *       *
      *       *
      * * * * *
 */
// public class _2_Basic_Pattern{
//  public static void main(String[] args) {
//     int n=4;
//     int m=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=m;j++){
//             if(i==1||j==1||i==n||j==m){
//                 System.out.print("* ");
//             }
//             else{
//             System.out.print("  ");
//         }
//         }
//         System.out.println();
//     }
//  }
// }

/*
 Q.3) Half Pyramid.
      *
      * *
      * * *
      * * * *
 */
// public class _2_Basic_Pattern{
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

/*
 Q.4) Inverted Half Pyramid.
      * * * *
      * * *
      * *
      *
 */
// public class _2_Basic_Pattern{
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

/*
 Q.5)       *
          * *     
        * * * 
      * * * *
 */
// public class _2_Basic_Pattern{
//     public static void main(String[] args) {
//         int n=4;
//         for(int i = 1;i<=n;i++){
//             for(int j=n-1; j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/*
 Q.6) 1
      1 2
      1 2 3
      1 2 3 4
 */
// public class _2_Basic_Pattern{
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j = 1; j<=i;j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

/*
 Q.7) 1 2 3 4 
      1 2 3
      1 2
      1
 */
// public class _2_Basic_Pattern{
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+ " ");
//             }
//             System.out.println();
//         }
//     } 
// }

/*
 Q.8) Floyed triangle
      1
      2  3
      4  5  6
      7  8  9 10
      11 12 13 14 15 
 */
// public class _2_Basic_Pattern{
//     public static void main(String[] args) {
//         int n=5;
//         int number=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                System.out.print(number+ " ");
//                number++;
//             }
//             System.out.println(" ");
//         }
//     }
// }


/*
 Q.9) 0-1 Triangle
      1
      0 1
      1 0 1
      0 1 0 1
 */
// public class _2_Basic_Pattern{
// public static void main(String[] args) {
//      int n=4;
//      for(int i=1;i<=n;i++){
//           for(int j=1;j<=i;j++){
//                if((i+j)%2==0){
//                     System.out.print("1 ");
//                }else{
//                     System.out.print("0 ");
//                }
//           }
//           System.out.println();
//      } 
// }
// }

