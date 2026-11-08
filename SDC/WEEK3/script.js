
let total = 0;

// Login Validation
function validateLogin() {
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    if (username == "" || password == "") {
        alert("Please enter username and password");
        return false;
    }

    alert("Login Successful!");
    return false;
}

// Registration Validation
function validateRegister() {
    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let password = document.getElementById("regpassword").value;

    if (name == "" || email == "" || password == "") {
        alert("Please fill all fields");
        return false;
    }

    if (!email.includes("@") || !email.includes(".")) {
        alert("Enter a valid email");
        return false;
    }

    if (password.length < 6) {
        alert("Password must contain at least 6 characters");
        return false;
    }

    alert("Registration Successful!");
    return false;
}

// Add Product
function add(price) {
    total = total + price;

    document.getElementById("total").innerHTML =
        "Total: Rs. " + total;
}

// Place Order
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
