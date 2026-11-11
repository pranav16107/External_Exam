let total = 0;
let cartItems = [];

function add(price) {
  cartItems.push(price);
  total = total + price;

  document.getElementById("cart").innerHTML = "";

  for (let i = 0; i < cartItems.length; i++) {
    document.getElementById("cart").innerHTML +=
      "Product " + (i + 1) + " - Rs. " + cartItems[i] + "<br>";
  }

  document.getElementById("total").innerHTML = "Total: Rs. " + total;
}

function order() {
  if (total == 0) {
    alert("Cart is empty");
  } else {
    alert("Order Placed!");

    total = 0;
    cartItems = [];

    document.getElementById("cart").innerHTML = "Cart is empty";

    document.getElementById("total").innerHTML = "Total: Rs. 0";
  }
}
