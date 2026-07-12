function Event(name, seats) {
    this.name = name;
    this.seats = seats;
}

Event.prototype.checkAvailability = function () {
    return this.seats > 0 ? "Available" : "Full";
};

const event1 = new Event("Tree Plantation", 20);

console.log(event1.checkAvailability());

Object.entries(event1).forEach(([key, value]) => {
    console.log(key, value);
});