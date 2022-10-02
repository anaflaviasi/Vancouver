// Question 3 , Write a binary function using recursion (VERY ADVANCE)

function binarySearch(array, item) {

    function recurse(min, max) {
  
      if (min > max) {
        return -1;
      }

      var mid = Math.floor((min + max) / 2);
  
      if (array[mid] === item) {
        return mid;
      }
      if (array[mid] > item) {
        return recurse(min, mid - 1);
      }
      return recurse(mid + 1, max);
    }  
    return recurse(0, array.length - 1);
  }
  
  console.log(binarySearch([1, 2, 3, 4, 6, 8, 9], 8));