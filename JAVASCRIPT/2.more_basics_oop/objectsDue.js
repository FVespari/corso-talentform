let smartphone = {
    marca: "Xiaomi",
    modello: "Redmi Note",
    fotocamera: "50 MPX",
    marca_and_modello: function () {
        return this.marca + " " + this.modello;
    }
}

smartphone.batteria= "5000 mAh";
smartphone.tecnologie_connessione= ["5G", "4G", "Bluethooth"],

console.log(smartphone.batteria);
console.log(smartphone);
console.log(smartphone.marca_and_modello()); //oggetto invoca la funzione
console.log(smartphone.tecnologie_connessione);