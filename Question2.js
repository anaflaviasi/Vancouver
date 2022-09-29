// Question 2
// Write a function that takes a value n as a parameter, and prints the following pattern

function printStars(n) {
    let item = "*****";
    
    for ( let i = 5; (i <= n && i > 0); i--) {
        item = item.replace(item[i], ''); 
        console.log(item);
    }

}

printStars(5);
