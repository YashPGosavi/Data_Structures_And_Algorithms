/*
Container with Most Water
For given n lines on x-axis, use 2 lines to form a container such that it holds maximum water.
        kheight = [1,8,6,2,5,4,8,3,7]
 */

import java.util.ArrayList;

public class _9_containerWithMostWater {

    public static int mostWater(ArrayList<Integer> height){

        int maxWater = 0;

        for(int i= 0;i<height.size()-1;i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int area = ht*width;
                maxWater=Math.max(maxWater,area);
            }
        }
        return maxWater;
    }

    // optimised
    public static int optimisedMostWater(ArrayList<Integer> height){

        int maxWater = 0;
        int start = 0;
        int end = height.size()-1;

        while( start != height.size()-1){
            int ht = Math.min(height.get(start),height.get(end));
            int width = end-start;
            int area = ht*width;
            maxWater=Math.max(maxWater,area);
            end --;
            if(start==end){
               start ++;
               end = height.size()-1;
            }   
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(optimisedMostWater(list));
    }
}
