const events = ["Music Show", "Sports Meet"];

const container = document.querySelector("#events");

events.forEach(event => {
    let card = document.createElement("div");
    card.innerHTML = event +
    " <button onclick='register(this)'>Register</button>";
    container.appendChild(card);
});

function register(btn) {
    btn.parentElement.innerHTML = "Registered";
}

function cancel(btn) {
    btn.parentElement.innerHTML = "Cancelled";
}