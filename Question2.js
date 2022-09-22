//Write a function that takes an array as a parameter and calculates the sum of the numbers
//inside the array

function sumArray(array){
     let sum = 0;
     for (let i = 0; i < array.length; i++ ) {
         sum = sum + array[i];
        }
        console.log(sum);      
 }

 let array = [1, 2, 3, 4, 5, 6];
 sumArray(array);