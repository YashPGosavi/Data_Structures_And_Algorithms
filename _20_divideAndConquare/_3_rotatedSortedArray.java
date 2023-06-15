public class _3_rotatedSortedArray {

// Using Recursion ( Divide And Conqure rule and Modified Binary search )    
    public static int rotatedSearch(int arr[], int targ, int si, int ei) {

        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;
        if (arr[mid] == targ) {
            return mid;
        }

        // Line 1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= targ && targ <= arr[mid]) {
                return rotatedSearch(arr, targ, si, mid - 1);
            } else {
                return rotatedSearch(arr, targ, mid + 1, ei);
            }
        }

        // Line 2
        else {
            if (arr[mid] <= targ && targ <= arr[ei]) {
                return rotatedSearch(arr, targ, mid + 1, ei);
            } else {
                return rotatedSearch(arr, targ, si, mid - 1);
            }
        }
    }


 // Using Loop   
    public static int rotatedSearchLoop(int arr[], int targ, int si, int ei) {
        
        int mid = si + (ei-si)/2;

        if(arr[mid]==targ){
            return mid;
        }

        while(si<ei){
            if(arr[si]<=arr[mid]){
                if(arr[si]<=targ&& targ<=arr[mid]){
                   return forLoop(arr, targ, si, mid-1);
                }else{
                   return forLoop(arr,targ,mid+1,ei);
                }
            }else{
                if(arr[mid]<=targ && targ<=arr[ei]){
                   return forLoop(arr, targ, mid+1, ei);
                }else{
                   return forLoop(arr, targ, si, mid-1);
                }
            }
        }
        return -1;
    }

    public static int forLoop(int arr[],int targ, int si, int ei){
        for(int i=si;i<=ei;i++){
            if(arr[i]==targ){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int targget = 1;
        int targIndx = rotatedSearchLoop(arr, targget, 0, arr.length - 1);
        System.out.println(targIndx);

    }
}
