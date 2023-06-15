public class _6_stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hallo World!");

        for(char ch='a';ch<='z';ch++){
            str.append(ch);
        }
        System.out.println(str.getClass());
        System.out.println(str);
    }
}
