
async function getWeather() {

    let city = document.getElementById("city").value;

    let key = "b19d6dbc4fc7ed53c9f63a2b287867c2";

    let url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${key}&units=metric`;

    let response = await fetch(url);
    let data = await response.json();

    let temp = data.main.temp;

    document.getElementById("result").innerHTML =
        "Temperature: " + temp + " °C";

    new Chart(document.getElementById("graph"), {
        type: "bar",
        data: {
            labels: ["Temperature"],
            datasets: [{
                label: "Temperature",
                data: [temp]
            }]
        }
    });
}
