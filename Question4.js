// Question 4 , Write a function to find the sum of numbers in an array but using recursion

function sum(array) {

    function sumArray(array, i) {

      if(i === array.length-1){
        return array[i];
        }
        return array[i] + sumArray(array, i+1);
    }
    return sumArray(array, 0);
}
    
console.log(sum([1, 2, 3, 4, 6, 8, 9]));