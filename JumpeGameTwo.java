public class JumpeGameTwo {
 public static int jump(int[] nums) {

        int near = 0, far = 0, jumps = 0;

        while (far < nums.length -1) {
            int farthest = 0;
            for(int i=near; i<=far; i++) {
                farthest = Math.max(farthest, i+nums[i]);
            }
                near = far+1;
                far = farthest;
                jumps++;
            
        }   

        return jumps; 
    }

    public static void main(String[] args) {
        int[] array = {3,3,1,2,3,2,5};
        System.out.print(jump(array));
    }
}
