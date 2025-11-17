// Va fatto per ogni tabella

// Versione corta
fetch("http://localhost:8081/api/nometabella1/getAll")
.then(res => res.json())
.then(data => console.log(data))
.catch(err => console.error(err));

// Versione lunga
fetch("http://localhost:8081/api/nometabella/getAll")
.then(res => res.json())
.then(data => {
    document.getElementById("lista").innerText =
        JSON.stringify(data, null, 2);
})
.catch(err => console.error(err)); 