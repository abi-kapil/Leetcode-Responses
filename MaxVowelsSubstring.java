
public class MaxVowelsSubstring {
    public static int solution (String s, int k) {
        int count = 0, left = 0, right = k, max = 0;
        boolean response = false;

        for (int i = 0; i < k; i++) {
            response = "aeiou".indexOf(s.charAt(i)) != -1;
            if (response) {
                count++;
            }
        }
        while (right < s.length()) {
            boolean right_vowels = "aeiou".indexOf(s.charAt(right)) != -1;
            boolean left_vowels = "aeiou".indexOf(s.charAt(left)) != -1;
            if (!right_vowels && left_vowels) {
                count--;
            } else if (right_vowels && !left_vowels) {
                count++;
            }
            left++;
            right++;
            if (count > max) max = count;
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(solution("abciiidef", 3));
    }
}
