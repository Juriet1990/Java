// Articolo
fetch("http://localhost:8081/api/articolo/getAll")
.then(res => res.json())
.then(data => console.log(data))
.catch(err => console.error(err));

// Ordine
fetch("http://localhost:8081/api/ordine/getAll")
.then(res => res.json())
.then(data => console.log(data))
.catch(err => console.error(err));

// Tariffa Corriere
fetch("http://localhost:8081/api/tariffa_corriere/getAll")
.then(res => res.json())
.then(data => console.log(data))
.catch(err => console.error(err));

// Voce
fetch("http://localhost:8081/api/voce/getAll")
.then(res => res.json())
.then(data => console.log(data))
.catch(err => console.error(err));