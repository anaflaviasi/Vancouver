// Write a function that takes an array as a parameter and returns the largest number inside that
// array

function largestNumber(array){
    let largest = 0.
    for (let i = 0; i < array.length; i++ ) {
        if (array[i] > largest) {
            largest = array[i];
       }    
    } 
    console.log(largest); 
}

let array = [20, 40, -10, 5, 40, 5, 11];
largestNumber(array);