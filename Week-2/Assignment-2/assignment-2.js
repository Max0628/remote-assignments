function avg(data) {
  // your code here
  let totalPrice = 0;
  for (let i = 0; i < data.products.length; i++) {
    totalPrice += data.products[i].price;
  }
  // console.log(totalPrice);/
  const average = totalPrice / data.size;
  return average;
}

console.log(
  avg({
    size: 3,
    products: [
      {
        name: "Product 1",
        price: 100,
      },
      {
        name: "Product 2",
        price: 700,
      },
      {
        name: "Product 3",
        price: 250,
      },
    ],
  })
); // should print the average price of all products
