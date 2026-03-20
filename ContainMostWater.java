public class ContainMostWater {
      public static int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            if (area > max) max = area;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] ques = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(ques));
    }
}
