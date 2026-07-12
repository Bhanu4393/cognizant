const events = [
    { name: "Tree Plantation", seats: 20 },
    { name: "Health Camp", seats: 0 }
];

events.forEach(event => {
    if (event.seats > 0) {
        console.log(event.name);
    } else {
        console.log(event.name + " is Full");
    }
});

try {
    let seats = 0;

    if (seats <= 0) {
        throw "Registration Failed";
    }

    seats--;
} catch (error) {
    console.log(error);
}