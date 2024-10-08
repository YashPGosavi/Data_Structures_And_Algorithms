/*

1] .length()
2] .concat(index)
3] .charAt()
4] .equals() 
5] .equalsIgnoreCase()
6] .subString(begin_index)
6.1 ] .subString(begin_index, ending index)
7] .toUpperCase()
8] .toLowerCase()


 */

public class _2_stringMethod {
    public static void main(String[] args) {

        // .length()
        String fullName = "Tony Stark";
        System.out.println(fullName.length()); // .length() function in String use to get whole length of string it count Blank-Scapes also in it.

        // .concat()
        String firstName = "Yash";
        String lastName = "Gosavi";
        System.out.println(firstName+" "+lastName); // + use to concate the string.
        System.out.println(firstName.concat(" " + lastName)); // concat() funtion also use to concate string.

        // .charAt()
        String Name = "Yash";
        System.out.println(Name.charAt(3)); // Provid character of the given index.

        // .equals() && equalsIgnoreCase() // returns boolean value
        String a= "yash";
        String b= "Yash";
        System.out.println(a.equals(b)); // Cheak String are equal Even cheak the cases are equal or not.
        System.out.println(a.equalsIgnoreCase(b)); // Cheak String are equal Ignore Case.

        // .sunString()
        String sub = "SubString";
        System.out.println(sub.substring(0,3));

        // .compareTo() // if output = 1 then larger   

        String m = "Mango";
        String n = "Nann";
        System.out.println(m.compareTo(n));

        // .toUpperCase()
        String name = "yash"; 
        System.out.println(name.toUpperCase());

        // .toLowerCase()
        String name2 = "SAMIKSHA"; 
        System.out.println(name2.toLowerCase());
    } 
}
