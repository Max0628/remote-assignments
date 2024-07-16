async function ajax(src, callback) {
  try {
    let response = await fetch(src);
    let data = await response.json();
    callback(data);
  } catch (error) {
    console.log("Error fetching: " + error);
  }
}

function render(data) {
  let list = document.querySelector("#cart");
  for (let i = 0; i < data.length; i++) {
    let obj = data[i];
    let name = "商品名稱:" + obj["name"];
    let price = "商品價格:" + obj["price"];
    let description = "商品內容:" + obj["description"];
    let item = document.createElement("li");
    const textNode = document.createTextNode(
      `${name}   ${price}   ${description}`
    );
    item.appendChild(textNode);
    list.appendChild(item);
  }
}

ajax(
  "https://remote-assignment.s3.ap-northeast-1.amazonaws.com/products",
  function (response) {
    render(response);
  }
);
