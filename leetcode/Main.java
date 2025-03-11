class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        int lastSpaceIndex = s.lastIndexOf(' '); // Find the last space
        return s.length() - lastSpaceIndex - 1; // Length of last word
    }
}
public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy")); // Output: 6
    }
}
