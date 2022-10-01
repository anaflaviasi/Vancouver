// Queston 3 → (ADVANCE)
// Write a function to check if there are duplicates in an array ?
// HINT - You have to use 2 for loops nested to solve this problem

function duplicatesArray(array){

    for ( let i = 0; i < array.length ; i++ ) {
        for ( let d = i + 1; d < array.length ; d++ ) { //Check duplicates
            if ( array[i] === array[d]){
                return true;
        }
    }
}
return false;
}

let numList = [20, 40, -10, 5, 40, 5, 11];
console.log(duplicatesArray(numList));