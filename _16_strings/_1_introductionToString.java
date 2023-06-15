import java.util.Scanner;

public class _1_introductionToString {
    public static void main(String[] args) {

      char arr[]={'C','H','A','R'};
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
      }
      System.out.println();

        // Strings are immutable

        //Method 1
        String abc = "ABC";
        System.out.println(abc);

        //Method 2
        String xyz = new String("XYZ");
        System.out.println(xyz);


        // Inputing String

        Scanner sc = new Scanner(System.in);
        String strinp = sc.next(); // Take only one word as a input
        System.out.println(strinp);

        String strinp1 = sc.nextLine();        
        System.out.println(strinp1); // Take whole line as a input

        String fullName = "Tony Stark";
        System.out.println(fullName.length()); // .length() function in String use to get whole length of string it count Blank-Scapes also in it.

        sc.close();
    }   
}

    
