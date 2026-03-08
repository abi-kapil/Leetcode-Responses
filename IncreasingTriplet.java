public class IncreasingTriplet {
    public static boolean solution (int[] nums) {
        
    /*
    1. Check for a small int at small i
    2. Verify next i is bigger with bigger int
    3. Verify same step
    4. All 3 steps worked, confirm true
//     */
//    int n = nums.length - 1;
//     int large = nums[n];
//     int count = 0;

//     while (count < 4) {
//         for(int i =  nums.length - 2; i >= 0; i-- ) {
//             if (nums[i] > large){
//                 return false;
//             }
//             large = nums[i];
//             n = i;
//             count++;
//         }
//     }

//         return true;
//     }
// }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){
            if (first >= nums[i]) {
                first = nums[i];
            } else if(nums[i] >= first && nums[i] <= second) {
                second = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}