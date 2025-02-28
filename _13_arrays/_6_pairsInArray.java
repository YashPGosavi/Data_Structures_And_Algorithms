/*

    Input 
        arr = {1,2,3,4,5}

        Total pair = (n*(n-1)) / 2 

    Output :-
        (1,2)(1,3)(1,4)(1,5)
        (2,3)(2,4)(2,5)
        (3,4)(3,5)
        (4,5)

 */

public class _6_pairsInArray {
    public static void pairsArray(int[] arr) {
        int totalpair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                totalpair++;    
            }
            System.out.println();
        }
        System.out.println("Total Pair :- " + totalpair);
    }

    public static void optimizedPairs(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start != arr.length-1){
            System.out.print("(" + arr[start] + "," + arr[end] + ")");
            end--;
            if(end == start ){
                start++;
                end = arr.length-1;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        pairsArray(arr);
        System.out.println("----------------------------------------");
        optimizedPairs(arr);
    }
}
