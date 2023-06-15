/*
Binary One's Complement ( ~ )

Rules :- 
1. ~0 :- 1
2. ~1 :- 0


Example :- ( ~5 ) :- -6

5 = 00000101
5 complement = 11111010
               |      |
              MSB    LSB

if most significant bit(MSB) = 1 number is negative else possitive

now find 2's complement of 5
                              00000101
                             +
                                     1
                          ----------------
                              00000110       = 6 but since MSB is 1 :. -6

 */
public class _5_binaryOnesComplement {
    public static void main(String[] args) {
        System.out.println((~5));
    }  
}
