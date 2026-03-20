public class FlowersBed {
    public static boolean solution(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
            boolean rightEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
            if (flowerbed[i] == 0 && leftEmpty && rightEmpty) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 0, 0, 0, 0, 1}, 1)); // true
        System.out.println(solution(new int[]{1, 0, 0, 0, 0, 1}, 2)); // false
        System.out.println(solution(new int[]{0, 0, 0}, 1));           // true
        System.out.println(solution(new int[]{1, 0, 1}, 1));           // false
    }
}
