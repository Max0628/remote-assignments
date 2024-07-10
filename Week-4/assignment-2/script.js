async function ajax(callback) {
  let response = await fetch(
    "https://remote-assignment.s3.ap-northeast-1.amazonaws.com/products"
  );
  let data = await response.json();
  callback(data);
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

ajax(render);
