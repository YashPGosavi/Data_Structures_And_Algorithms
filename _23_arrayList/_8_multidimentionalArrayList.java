import java.util.ArrayList;

// public class _8_multidimentionalArrayList {

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

//         ArrayList<Integer>list_1 = new ArrayList<>();
//         list_1.add(1); list_1.add(2);
//         mainlist.add(list_1);

//         ArrayList<Integer> list_2 = new ArrayList<>();
//         list_2.add(3); list_2.add(4);
//         mainlist.add(list_2);

//         for(int i=0;i<mainlist.size();i++){
//             ArrayList<Integer> currentList = mainlist.get(i);
//             for(int j=0;j<currentList.size();j++){
//                 System.out.print(currentList.get(j)+" ");
//             }
//             System.out.println();
//         }

//         System.out.println(mainlist);
//     }

// }



public class _8_multidimentionalArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList <Integer>> mainList = new ArrayList<>();

        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
 
