form.onsubmit = function(event) {

    event.preventDefault();

    let name = form.elements["name"].value;
    let email = form.elements["email"].value;
    let eventName = form.elements["event"].value;

    if(name == "" || email == "") {
        error.innerHTML = "All fields are required";
        return;
    }

    error.innerHTML =
    "Registered for " + eventName;
};