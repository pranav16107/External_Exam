
let items = [];
let total = 0;

function add(price) {
    items.push(price);
    total += price;
    update();
}

function removeItem(i) {
    total -= items[i];
    items.splice(i, 1);
    update();
}

function update() {
    let output = "";

    for (let i = 0; i < items.length; i++) {
        output += "Product - Rs. " + items[i] +
        " <button onclick='removeItem(" + i + ")'>Remove</button><br>";
    }

    document.getElementById("cart").innerHTML = output || "Cart is empty";
    document.getElementById("total").innerHTML = "Total: Rs. " + total;
}

function order() {
    if (items.length == 0) {
        alert("Cart is empty!");
    } else {
        alert("Order placed successfully!");

        items = [];
        total = 0;
        update();
    }
}

update();
