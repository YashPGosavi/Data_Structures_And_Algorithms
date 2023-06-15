/*
 Insertion Sort :- Pick an element(from unsorted part) & place in the right pos in sorted part. Time-Complexity ( O(n) ).

** INSERTION SORT ALGORITHM
1.SET A MARKER FOR THE SORTED SECTION AFTER THE FIRST ELEMENT
2. REPEAT THE FOLLOWING UNTILL UNSORTED
        SECTION IS EMPTY:
                1. SELECT THE FIRST UNSORTED ELEMENT SWAP OTHER ELEMENTS TO THE RIGHT TO CREATE
                2. THE CORRECT POSITION AND SHIFT THE UNSORTED ELEMENT.
                3. ADVANCE THE MARKER TO THE RIGHT ONE ELEMENT
 */
public class _3_insertionSort {
    public static void insertiontionSort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int prev = i-1;
 
            // finding out correct position to insert
            while(prev>=0 && current < arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1]=current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  
        }
    }
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        insertiontionSort(arr);
    }
}
