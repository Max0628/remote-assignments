function count(input) {
  // your code here
  const obj = {};
  for (let i = 0; i < input.length; i++) {
    //if the object not have the key,just create one,set value to 1
    if (!obj[input[i]]) {
      obj[input[i]] = 1;
    }
    //if the object have the key ,value plus one
    else if (obj[input[i]]) {
      obj[input[i]]++;
    } else {
      return -1;
    }
  }
  return obj;
}

let input1 = ["a", "b", "c", "a", "c", "a", "x"];
console.log(count(input1));
// should print {a:3, b:1, c:2, x:1}

//=========================================================================
//=========================================================================
function groupByKey(input) {
  // your code here
  const obj = {};

  //iterate over objects in array
  for (let i = 0; i < input.length; i++) {
    // console.log(input[i].key, input[i].value);

    //the same strategy as request one
    if (!obj[input[i].key]) {
      obj[input[i].key] = input[i].value;
    } else if (obj[input[i].key]) {
      obj[input[i].key] += input[i].value;
    } else {
      return -1;
    }
  }
  return obj;
}

let input2 = [
  { key: "a", value: 3 },
  { key: "b", value: 1 },
  { key: "c", value: 2 },
  { key: "a", value: 3 },
  { key: "c", value: 5 },
];

console.log(groupByKey(input2));
// should print {a:6, b:1, c:7}
