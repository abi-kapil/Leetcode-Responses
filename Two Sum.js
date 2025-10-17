/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
   let arrayMap = new Map();

   for(let i=0; i<nums.length; i++) {
    let difference = target - nums[i];

    if(arrayMap.has(difference)) {
        return[i, arrayMap.get(difference)];
    }

    arrayMap.set(nums[i],i);
   }
};
