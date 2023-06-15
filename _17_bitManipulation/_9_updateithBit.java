
public class _9_updateithBit {

    public static int updateithBit(int n,int i, int newBit){
        // clear the i th bit
        int clearMask = 1<<i;
        n = (n&(~clearMask));

        //update the bit
        int bitMask=newBit<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateithBit(10, 2, 1));
    }
}
