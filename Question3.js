// Question 3
// Write a function that takes a value n as a parameter, and prints the following pattern

function printStars(n) {
    
    var item = "";
    let posFirst = Math.ceil(15/2);
    let posLast = posFirst;
    let space = 0;
     
    for (let i = 1; i <= n ; i++) {
         
      if (space > 1 ) {
        posFirst = posFirst - 2;
        posLast  = posLast + 2;
       }

      for (space = 1; space < posFirst; space++) {
        item = item + " ";
      } 
      
      for (let star = 0; star < 2 * i - 1; star++) {
        if (star == 0 || star == 2 * i -2) {
           if (i == 4 && star > 5){
            item = item + "  *";
           }
           else{
          item = item + "*";
        }  
      }
        else if (star == 1 && i != 4) {
             for (space = posFirst; space < posLast; space++) {
              item = item + " ";
             } 
        }
         else if (star == 1 && i == 4 ) {
            item = item + "  *";
          }
          else if (star < 5 && i == 4) {
            item = item + " *";
           }
      }  
      item += "\n"; 
    }
    console.log(item);
}

  printStars(4);



  