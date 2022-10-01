// Queston 2 (ADVANCE)
// Write a function to check if there are duplicates in a sorted array ?
// HINT - You have to use 2 for loops nested to solve this problem

function duplicatesArrayInSorted(array){

    for ( let i = 0; i < array.length ; i++ ) {
      if (array[i] === array[i+1]){
        return array[i];
      }
    }
}

let numList = [2, 10, 12, 12, 40 , 50];
console.log(duplicatesArrayInSorted(numList));