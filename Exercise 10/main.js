const event1 = {
    name: "Music Show",
    category: "Music"
};

function showEvent(event = "No Event") {
    console.log(event);
}

const { name, category } = event1;

console.log(name, category);

const events = [event1];
const copiedEvents = [...events];

const musicEvents = copiedEvents.filter(
    e => e.category === "Music"
);

console.log(musicEvents);

showEvent();