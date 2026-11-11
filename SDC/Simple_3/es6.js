// 1. Arrow Function
const add = (a, b) => {
    return a + b;
};

console.log("Addition:", add(10, 20));


// 2. Callback Function
function greet(name, callback) {
    console.log("Hello " + name);
    callback();
}

greet("Student", () => {
    console.log("Callback executed");
});


// 3. Promise
let myPromise = new Promise((resolve, reject) => {
    resolve("Promise Successful");
});

myPromise.then((result) => {
    console.log(result);
});


// 4. Async and Await
async function display() {
    let result = await myPromise;
    console.log("Async/Await:", result);
}

display();
