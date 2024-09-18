/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
   var c1=0;
   for(let c of nums)
   {
    c1^=c;
   } 
   return c1;
};