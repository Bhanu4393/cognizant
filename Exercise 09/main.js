fetch("https://jsonplaceholder.typicode.com/users")
.then(res => res.json())
.then(data => {
    console.log(data);
    loading.innerHTML = "Data Loaded";
})
.catch(error => console.log(error));

async function getEvents() {
    try {
        let res = await fetch("https://jsonplaceholder.typicode.com/users");
        let data = await res.json();
        console.log(data);
    }
    catch(error) {
        console.log(error);
    }
}

getEvents();