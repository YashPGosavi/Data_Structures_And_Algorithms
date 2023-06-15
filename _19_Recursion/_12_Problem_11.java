/*
Problem 12
Remove Duplicates in a String
"appnnacollege"
 */
public class _12_Problem_11 {
    public static void removeDuplicate(String str, int index, StringBuilder newStrBuild, boolean[] map) {
        if (index == str.length()) {
            System.out.println(newStrBuild);
            return;
        }

        char currentChar = str.charAt(index);

        if (map[currentChar - 'a'] == true) {
            removeDuplicate(str, index + 1, newStrBuild, map);
            return;
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicate(str, index + 1, newStrBuild.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
