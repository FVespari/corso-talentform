let marchiMoto = ["Aprilia", "Ducati", "MV Augusta"];

for (let index = 0; index < marchiMoto.length; index++) { // ITERO IL MIO ARRAY
  console.log(marchiMoto[index]);
}

console.log('===============================================');

marchiMoto.unshift("Honda"); // aggiungo un elemento alla prima posizione

for (let index = 0; index < marchiMoto.length; index++) { // ITERO IL MIO ARRAY
  console.log(marchiMoto[index]);
}

console.log('===============================================');

marchiMoto.splice(2, 0, "Yamaha", "Triumph"); // aggiungo 2 elementi all'indice 2

for (let index = 0; index < marchiMoto.length; index++) { // ITERO IL MIO ARRAY
  console.log(marchiMoto[index]);
}

console.log('===============================================');

marchiMoto.splice(0, 4); // rimuovo 4 elementi partendo dall'indice 0

for (let index = 0; index < marchiMoto.length; index++) { // ITERO IL MIO ARRAY
  console.log(marchiMoto[index]);
}

console.log('===============================================');

let studenti = ["Giulia", "Genoveffa", "Vercingetorige"];

studenti.forEach(function (item, index) {
  // ciclare array
  console.log(index + " - " + item);
});

console.log('===============================================');

for (let index = 0; index < studenti.length; index++) { // ITERO IL MIO ARRAY
  console.log(studenti[index]);
}

console.log('===============================================');

for (let i = 0; i < studenti.length; i++) { // ITERO IL MIO ARRAY
  console.log(i + " - " + studenti[i]);
}

console.log('===============================================');

let fumetti = ["Paperino", "Topolino", "Pippo", "Minnie", "Zio Fester", "Gargamella"];

fumetti.forEach(function (item, index) {
  // ciclare array
  console.log(index + " - " + item);
});

console.log('===============================================');

fumetti.splice(2, 3); // parto dall'indice 2 e rimuovo 3 elementi

fumetti.forEach(function (item, index) {
  // ciclare array
  console.log(index + " - " + item);
});

console.log('===============================================');

fumetti.splice(1, 0, "Jack Lo Squartatore", "Don Abbondio"); // aggiungo 2 elementi all'indice 2

fumetti.forEach(function (item, index) {
  // ciclare array
  console.log(index + " - " + item);
});

console.log('===============================================');

let numeri = [1, 2, 3, 4, 1, 2, 5, 6, 3]; // rimuovo i valori duplicati

numeri.forEach(function (item, index) {
  // ciclare array
  console.log(index + " - " + item);
});

console.log('===============================================');

let arrayNuovo = new Set(numeri);
console.log(arrayNuovo);

console.log('===============================================');

let nomi = ['FRANCESCO','CARMELA','ROSSELLA','FRANCESCO']
let senzaDuplicati = new Set(nomi);
console.log(senzaDuplicati);