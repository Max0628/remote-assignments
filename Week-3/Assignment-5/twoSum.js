//can use in unsorted array

function twoSum(nums, target) {
  //set an empty obj to store the number maybe can be match
  let obj = {};
  for (let i = 0; i < nums.length; i++) {
    //this number maybe can match
    let gap = target - nums[i];
    //if the number is in the obj
    if (gap in obj) {
      //return the value(index) of gap,and i ,"i" iterate the array earlier
      return [obj[gap], i];
    }
    obj[nums[i]] = i; //insert can't in front of if statement!!
  }
  return -1;
}
console.log(twoSum([2, 7, 11, 15], 9)); // return [0, 1]
//console.log(twoSum([7, 7, 11, 15, 1, 8, 3, 6, 4, 4], 16)); // return  [3,4]
