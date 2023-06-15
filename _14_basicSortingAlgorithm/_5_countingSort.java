/*

 */
public class _5_countingSort {
    public static void countSort(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        int [] frq = new int[max+1];
        
        for(int i=0;i<arr.length;i++){
            frq[arr[i]]++;
        }

        // Sorting
        int j=0;
        for(int i=0;i<frq.length;i++){
            while(frq[i]>0){
                arr[j]=i;
                j++;
                frq[i]--;
            }

        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
     int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};
     countSort(arr);
    }
}
