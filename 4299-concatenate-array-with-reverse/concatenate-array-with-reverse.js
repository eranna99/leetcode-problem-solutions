/**
 * @param {number[]} nums
 * @return {number[]}
 */
var concatWithReverse = function(nums) {
    
    let arr=[...nums]
    let left=0;
    let right=nums.length-1;
    while(left<right){
        [nums[left],nums[right]]=[nums[right],nums[left]];
        left++;
        right--;
    }
    let ans= arr.concat(nums);
    return ans;
};