import java.util.Arrays;

public class kidsGreatestNum {
    public static boolean[] solution(int[] candies, int extraCandies) {
        int maximum = Arrays.stream(candies).max().getAsInt();
        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            result[i] = candies[i] + extraCandies >= maximum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testArr = {2, 3, 5, 1, 3};
        int extra = 3;
        System.out.println(Arrays.toString(solution(testArr, extra)));
    }
}
