public class Main {
    public static void main(String[] args) {
        String result = getLeftoverString("AABBCC", "AB");
        System.out.println(result); // Output: "CC"
        
        result = getLeftoverString("HELLO", "HI");
        System.out.println(result); // Output: "ELLO"
        
        result = getLeftoverString("XYZ", "AEIOU");
        System.out.println(result); // Output: "XYZ"
        
        result = getLeftoverString("ABCDE", "BCDEF");
        System.out.println(result); // Output: "A"
        
        result = getLeftoverString("AAAAA", "A");
        System.out.println(result); // Output: "Empty"
    }
    
    public static String getLeftoverString(String A, String B) {
        StringBuilder sb = new StringBuilder();
        boolean[] shouldRemove = new boolean[26]; // Assuming English alphabet only (A-Z)
        
        // Mark characters from string B that should be removed
        for (int i = 0; i < B.length(); i++) {
            char ch = B.charAt(i);
            shouldRemove[ch - 'A'] = true; // Marking the corresponding index true
        }
        
        // Build the result string by iterating through string A
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (!shouldRemove[ch - 'A']) {
                sb.append(ch); // Append to result if character should not be removed
            }
        }
        
        // Return "Empty" if the result string is empty
        if (sb.length() == 0) {
            return "Empty";
        } else {
            return sb.toString();
        }
    }
}




