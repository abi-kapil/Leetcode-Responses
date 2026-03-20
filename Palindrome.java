public class Palindrome {
     public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        boolean response = false;
        int backIndex = s.length() - 1;
        int index = 0;
        System.out.println(s);
        while ( index < backIndex) {
            Character q = s.charAt(index);
            Character p = s.charAt(backIndex);
            if(s.charAt(index) == s.charAt(backIndex)) {
                response = true;
            } else {
                response = false;
                break;
            }
            index++;
            backIndex--;
        }
        
        return response;
    };

    public static void main(String[] args) {
        System.out.println(isPalindrome(",; W;:GlG:;l ;,"));
        // System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }
}
