package techTestMethods;

/**
*class to find the solution for challange Finds the sum of multiples of 3 or 5 that is less than the provided number
*@ autor Dearbhail Rice 
*/
public class Solution {
// checking syntax / spelling in eclipse 

  /**
  *method to chck if a number is a multiple of 3 or 5 and sum the numbers together 
  */
  public int solution(int number) {
  int sum = 0;
   // System.out.println(number);
    for (int loop = 0 ; loop <number ; loop++){
     // System.out.println("loop"+ loop);
      if (loop%5==0){
      sum+=loop;
      } else if (loop%3==0){
      sum+=loop;
      }
     // System.out.println("sum "+sum);
    }
    return sum;
  }

}