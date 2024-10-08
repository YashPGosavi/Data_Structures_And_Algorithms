public class _8_stringComprassion {

    public static String stringCompress(String str) {
        String newstr = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            Integer count = 1;
            while ( i < n-1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count.toString();
            }
        }
        return newstr;
    }


    public static String stringCompress_Method2(String str) {
        StringBuilder sb = new StringBuilder("");
        int s = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                s++;
            } else {
                sb.append(str.charAt(i));
                if (s > 1) {
                    sb.append(s);
                }
                s = 1;
            }
        }

        sb.append(str.charAt(str.length() - 1));
        if (s > 1) {
            sb.append(s);
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(stringCompress(str));
    }
}