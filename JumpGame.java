class JumpGame {
    public boolean canJump(int[] nums) {
        int jumpsRemain = nums[0];
        for(int i=0; i<nums.length; i++) {
            if(nums.length <= i + jumpsRemain) {
                return true;
            } else if (jumpsRemain == 0) {
                return false;
            } else if (jumpsRemain < nums[i]) {
                jumpsRemain = nums[i];
            } else {
                jumpsRemain--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2,3,1,1,4};
        System.out.println(jumpGame.canJump(nums)); // Output: true
    }
}