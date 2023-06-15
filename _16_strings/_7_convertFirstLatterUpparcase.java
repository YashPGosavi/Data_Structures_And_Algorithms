//For a given String convert each the first letter of each word to uppercase. "hi, i am Yash"

public class _7_convertFirstLatterUpparcase {
    public static StringBuilder firstUppercase(String str) {
        StringBuilder strbild = new StringBuilder("");

        strbild.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                strbild.append(str.charAt(i));
                i++;
                strbild.append(Character.toUpperCase(str.charAt(i)));
            } else {
                strbild.append(str.charAt(i));
            }
        }
        return strbild;
    }

    public static void main(String[] args) {
        String str = "hi, i am Yash";
        System.out.println(firstUppercase(str));
    }
}
