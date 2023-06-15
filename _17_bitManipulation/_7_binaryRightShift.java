/*

Binary Rignt Shift ( >> )

Rules :-
        a>>b

        if a = 12345
           b = 2
         ans = 00123

Exampler :- 5<<1 = 2
         A = 000101
       ans = 000010    

|--------------------|
|formula :-          |    
|                    |
|    a<<b = a / 2^b  |
|                    |   
|--------------------| 

*/
public class _7_binaryRightShift {
    public static void main(String[] args) {
        System.out.println(5>>1);
    }
}
