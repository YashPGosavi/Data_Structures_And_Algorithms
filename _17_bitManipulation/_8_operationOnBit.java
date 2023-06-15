/*
 Operations
1. Get ith bit

2. Set ith bit

3. Clear ith bit
 */

// public class _8_operationOnBit {
//     public static int getIthBit(int n, int i) {
//         int bitMask = 1 << i;
//         if ((n & bitMask) == 0) {
//             return 0;
//         } else {
//             return 1;
//         }
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println(getIthBit(n, 3));
//     }
// }


// public class _8_operationOnBit {
//     public static int setIthBit(int n, int i) {
//         int bitMask = 1 << i;
//         return (n | bitMask);
//     }

//     public static void main(String[] args) {
//         System.out.println(setIthBit(10, 2));
//     }
// }


// public class _8_operationOnBit {
//     public static int clearIthBit(int n, int i) {
//         int bitMask = ~(1 << i);
//         return (n & bitMask);

//         /*
        
//         n = 10;
//         i = 1;
//         bitmask = ~(0010)

//         ~0010 = 1101

//         1010
//     &
//         1101
//       --------
//         1000  == 8;
        
//         */
//     }

//     public static void main(String[] args) {
//         System.out.println(clearIthBit(10, 1));
//     }
// }


public class _8_operationOnBit {
    public static int clearRangeinBits(int n, int i,int j) {
        int a = (~(0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearRangeinBits(10, 2, 4));
    }
}

