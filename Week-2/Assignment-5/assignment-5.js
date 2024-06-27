function binarySearchPosition(numbers, target) {
  // your code here

  //set the far left and far right index to converge towards the middle
  let left = numbers[0];
  let right = numbers[numbers.length - 1];

  //make sure the two index did not get across,if they overlapping,
  //jump out of while loop,that means we get the target

  while (right > left) {
    let avg = Math.floor((right + left) / 2);
    if (avg > target) {
      right = avg;
    } else if (avg < target) {
      left = avg;
    } else {
      // console.log(avg);
      for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] === target) {
          // console.log(i);
          return i;
        }
      }
      return avg;
    }
  }
}
console.log(binarySearchPosition([1, 2, 5, 6, 7], 1)); // should print 0
console.log(binarySearchPosition([1, 2, 5, 6, 7], 6)); // should print 3
