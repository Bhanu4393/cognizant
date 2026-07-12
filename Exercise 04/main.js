let events = [];

function addEvent(name, category) {
    events.push({ name, category });
}

function registerUser(user) {
    console.log(user + " Registered");
}

function filterEventsByCategory(callback) {
    console.log(events.filter(callback));
}

function registrationCounter() {
    let total = 0;

    return function () {
        total++;
        return total;
    };
}

const count = registrationCounter();

addEvent("Tree Plantation", "Environment");
addEvent("Health Camp", "Health");

registerUser("Mithun");

console.log("Registrations:", count());
console.log("Registrations:", count());

filterEventsByCategory(event => event.category === "Health");
