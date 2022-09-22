//Print all the odd numbers from 0 → n , where n will be dynamic inside a function

//  Solution 1
function printOddBySum(n){
{
    for (let i = 1; i <= n; i+= 2 ) {
        console.log(i);
      }
}
}
printOddBySum(30);


//  Solution 2
function printOddByDivision(n){

    for (let i = 1; i <= n; i++) {
        if (i % 2 == 1 ) {
            console.log(i);
        }
      }
}
printOddByDivision(30);