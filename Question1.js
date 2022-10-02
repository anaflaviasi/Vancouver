// Question 1 Write a function to find the index of the value in the 2D Array

let numList = [[1,2,3], [4,5,6], [7,8,9]];
let targ = 5;

function findIndex(array, target) {
   
    for (let l = 0 ; l < array.length; l++) {
        for (let i = 0; i < array[l].length; i++){
            if (array[l][i] === target){
                return [l, target];
            }
        }
    }
}

console.log(findIndex(numList, targ));