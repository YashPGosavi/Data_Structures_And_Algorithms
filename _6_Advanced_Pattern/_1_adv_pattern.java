import java.util.ArrayList;
// import java.util.Scanner;



/*
 1 2 3 4 17 18 19 20
 5 6 7 14 15 16
 8 9 12 13
 10 11
 */
// public class _1_adv_pattern{
//     public static void main(String[] args){
//         ArrayList<ArrayList<Integer>> a = new ArrayList<>();
//         int x=1;
//         int n=4;
//         for(int i=0;i<n;++i){
//             ArrayList<Integer> temp = new ArrayList<>();
//             for(int j=0;j<n-i;++j){
//                 temp.add(x);
//                 x++;
//             }    
//             a.add(temp);    
//         }
//         for(int i = n-1;i>=0;--i){
//             for(int j=0;j<n-i;j++){
//                 a.get(i).add(x);
//                 x++;
//             }
//         }
//         for(int i = 0;i<a.size();i++){
//             System.out.println(a.get(i));
//         }
//     }
// }


// /*
//  1 2 3 4 17 18 19 20
//  5 6 7 14 15 16
//  8 9 12 13
//  10 11
//  */
public class _1_adv_pattern{
    public static void main(String[] args){
        int n = 4;
        int a=1;
        int b=n*(n+1);

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(a++ + " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(b-- +" ");
            }
            System.out.println();
        }
    }
}



 /*
   1)   1
        11
        111
 public class _1_adv_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. : ");
        int n= sc.nextInt();
        String s = new String();
        for ( int i=0;i<n;++i){
            s+="1";
        }
        for(int i=0;i<n;++i){
            System.out.println(s.substring(0,i+1));
        }
        sc.close();
    }
 }
 */


 /*
1)  1 2 3 4 5 
    11 12 13 14 15 
    21 22 23 24 25 
    16 17 18 19 20 
    6 7 8 9 10

public class _1_adv_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. : ");
        int n= sc.nextInt();
        int k=1,a=0,b=n-1;
        String[] s = new String[n];
        for(int i=0;i<n;++i){
            String temp = new String();
            for(int j=0;j<n;j++){
                temp+=k+" ";
                k++;
            }
            if(i%2==0){
                s[a]=temp;
                a++;
            }
            else{
                s[b]=temp;
                b--;
            }
        }
       for(int i=0;i<n;++i){
            System.out.println(s[i]);
        }
        sc.close();
    }
}
  */
