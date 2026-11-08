
let total = 0;

function add(price) {
    total = total + price;

    document.getElementById("total").innerHTML =
        "Total: Rs. " + total;
}

function order() {
    if (total == 0) {
        alert("Cart is empty");
    } else {
        alert("Order Placed!");

        total = 0;

        document.getElementById("total").innerHTML =
            "Total: Rs. 0";
    }
}
