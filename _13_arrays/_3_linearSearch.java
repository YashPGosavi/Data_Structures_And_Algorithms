
/*
 Linear Search :- Searching linearly ( one after another.)
 */

//  public class _3_linearSearch{
//     public static int number(int [] n, int key){
//     for(int i=0;i<n.length;i++){
//         if(n[i]==key){
//             return i;
//         }
//     }
//     return -1;
// }
//     public static void main(String[] args) {
//         int [] n = {2,3,4};
//         int key = 2;
//         number(n, key);
//         if(number(n, key)==-1){
//             System.out.println("Not Found");
//         }else{
//             System.out.println("Found");
//         }
//     }
//  }



// public class _3_linearSearch{
//     public static String str(String[] n, String key){
//     for(int i=0;i<n.length;i++){
//         if(n[i]==key){
//             return key;
//         }
//     }
//     return null;
// }
//     public static void main(String[] args) {
//         String[] n = {"A","B","C"};
//         String key = "A";
//         str(n, key);
//         if(str(n, key)==null){
//             System.out.println("Not Found");
//         }else{
//             System.out.println("Found");
//         }
//     }
//  }

// Find largest number and minimum  number from array

public class _3_linearSearch{
    public static void largSmall(int n[]){
        int smallest = Integer.MAX_VALUE;
        int largest =  Integer.MIN_VALUE;

        for(int i=0;i<n.length;i++){

            if(smallest>n[i]){
                smallest=n[i];
            }
            
            if(largest<n[i]){
                largest=n[i];
            }
        }

        System.out.println("Smallest number is : "+smallest);
        System.out.println("Largest number is : "+largest);

    }
    public static void main(String[] args) {
        int [] n = {1,2,3,4,5};
        largSmall(n);
    
    }
}