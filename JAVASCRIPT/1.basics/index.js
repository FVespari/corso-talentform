let pc = 'notebook' // dichiarazione e inizializzazione di una variabile
const year = 2025 // dichiarazione e inizializzazione di una costante
// la variabile può essere ridefinita mentre la costante no
pc = 'pc fisso' // si può fare
//year = 2024 // NON si può fare
console.log(pc)

let x = 7
let y = 8
let verifica = x == y ? true : false;
console.log('verifica: ' + verifica);

let numeroStringa = '3'
let somma = 2+1
let check = numeroStringa === somma ? true : false;
console.log('check: ' + check);

console.log(typeof numeroStringa);
console.log('Non è un numero? ' + isNaN('serenata'));   // restituisce TRUE perché è vero che 'serenata' NON È un numero
console.log('Non è un numero? ' + isNaN(7));            // restituisce FALSO perché è falso che 7 NON È un numero