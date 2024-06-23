function countAandB(input) {
  let num1 = 0;
  let num2 = 0;
  for (let i = 0; i < input.length - 1; i++) {
    if (input[i] == "a") {
      num1++;
    }
    if (input[i] == "b") {
      num2++;
    }
  }
  let answer =
    "total is " +
    (num1 + num2) +
    " letter" +
    " , " +
    num1 +
    " ‘a’ " +
    "letter" +
    " and " +
    num2 +
    " ‘b’ " +
    "letter";

  return answer;
}

function toNumber(input) {
  let newArr = [];
  for (let i = 0; i < input.length; i++) {
    switch (input[i]) {
      case "a":
        newArr.push(1);
        break;
      case "b":
        newArr.push(2);
        break;
      case "c":
        newArr.push(3);
        break;
      case "d":
        newArr.push(4);
        break;
      case "e":
        newArr.push(5);
        break;
      default:
        break;
    }
  }
  return newArr;
}

let input1 = ["a", "b", "c", "a", "c", "a", "c"];
let input2 = ["e", "d", "c", "d", "e"];

console.log(countAandB(input1)); // should print 4 (3 ‘a’ letters and 1 ‘b’ letter)
console.log(toNumber(input1)); // should print [1, 2, 3, 1, 3, 1, 3]
console.log(countAandB(input2)); // should print 0
console.log(toNumber(input2)); // should print [5, 4, 3, 4, 5]
