// ============================
// =            A             =
// ============================
function delayedResult(n1, n2, delayTime, callback) {
  // let startTime = performance.now();

  let result = n1 + n2;
  setTimeout(() => {
    // after seconds pass the result to the callback function
    callback(result);
    //let endTime = performance.now();
    // console.log(`time it took:${(endTime - startTime) / 1000} seconds"`);
  }, delayTime);
}

delayedResult(4, 5, 3000, function (result) {
  console.log(result);
});
// 9 (4+5) will be shown in the console after 3 seconds

delayedResult(-5, 10, 2000, function (result) {
  console.log(result);
});
// // 5 (-5+10) will be shown in the console after 2 seconds

// ============================
// =            B             =
// ============================
function delayResultPromise(n1, n2, delayTime) {
  //let startTime = performance.now();
  return new Promise(function (resolve) {
    setTimeout(() => {
      resolve(n1 + n2);
      //let endTime = performance.now();
      //console.log(`time it took:${(endTime - startTime) / 1000} seconds"`);
    }, delayTime);
  });
}
delayResultPromise(4, 5, 3000).then(console.log);
//9 (4+5) will be shown in the console after 3 seconds

// ============================
// =            C             =
// ============================
async function main() {
  const result = await delayResultPromise(4, 5, 3000);
  console.log("result:" + result);
}
main();
