// Question 2 Write a function that takes a string, and capitalizes every first letter of the word

let str = "hello world";

function capitalize(str){

    let stringCap = str.split(" ");

    for ( var i = 0; i < stringCap.length; i++ ){
        stringCap[i] = stringCap[i].charAt(0).toUpperCase() + stringCap[i].slice(1);
    }
    return str = stringCap.join(" ");
}

console.log(capitalize(str));