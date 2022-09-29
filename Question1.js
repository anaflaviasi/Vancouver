// Question
// Write a function that takes a value n as a parameter, and prints the following pattern

function printStars(n) {
    let item = "";
    for (let i = 0; i < n ; i++) {
        item = item + "*";  
        console.log(item);
    }

    n = 4;
    for ( let i = 4; (i <= n && i > 0); i--) {
        item = item.replace(item[i], ''); 
        console.log(item);
    }

}

printStars(5);
