public class ReserveWords {
    public static String solution (String s) {
        String[] response = s.trim().replaceAll(" +", " ").split(" ");

        for(int i = 0; i < response.length / 2; i++) {
            String temp = response[i];
            response[i] = response[response.length - i];
            response[response.length - i] = temp;
        }
        return String.join(" ", response);
    }
    public static void main(String[] args) {
        
    }
}