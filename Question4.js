// // Question 4
// // Write a function which accepts 4 parameters (different scores of a student for subjects), and
// // then calculate the average of all the score.
// // If the average is more than 90 , then console grade A
// // If the average is between 70 and 90 , then console grade B
// // If the average is between 50-70, then console grade C
// // Other wise console grade F


 function getGrade(sub1, sub2, sub3, sub4) {
   let sumSub =  sub1 + sub2 + sub3 + sub4;
   let average = (sumSub / 400) * 100;
   
   if (average > 90) {
    return "grade A";    
}  else if (average >=70 && average <= 90) {
     return "grade B"; 
}  else if (average >= 50 && average < 70) {
      return "grade C"; 
}   else {
    return "grade F";
}
 }

 console.log(getGrade(90,80,70,60));
