/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
   let c=0;
   for(let i=0;i<nums.length;i++)
   {
    c^=nums[i];
   } 
   return c;
};