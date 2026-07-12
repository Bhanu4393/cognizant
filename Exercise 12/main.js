function sendData() {

    msg.innerHTML = "Sending...";

    setTimeout(() => {

        fetch("https://jsonplaceholder.typicode.com/posts", {
            method: "POST",
            body: JSON.stringify({
                name: "Mithun"
            })
        })

        .then(() => {
            msg.innerHTML = "Registration Successful";
        })

        .catch(() => {
            msg.innerHTML = "Registration Failed";
        });

    }, 2000);
}