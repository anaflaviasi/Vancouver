// //Question 1 (ADVANCE)
// //Write a function that checks if an array is sorted ?

function sortedList(array){

    for ( let i = 0; i < array.length ; i++ ) {
           if (array[i] > array[i+1]) {
            return false;
           }
    }
    return true;
}

let numList = [1,2,3,4,5,6];
console.log(sortedList(numList));