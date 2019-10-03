package techTestMethods;



/**
*class which attempts to  solve the challange take a string of braces, and determines how many pairs of braces exist in that string.
*@author Dearbhail rice 
*/
public class Challenge {
  //basic level tests passing, checking formatt and comments ect then will look to create further test cases 
  //considering  does a pair omly count as an open followed by a close? appears yes 
  /**
  *method to identify homany pairs of braces a string has, sets to -1 if braces are not balanced 
  *@return numOfBraces (in pairs)
  */
 public static  char[] bracketsOpen = new char [] {'(','{','['};
 public static  char[] bracketsClosed = new char [] {')','}',']'};
  
  /**
  *method to return the number of brace pairs if a strings braces are balanced
  *@return int numOfBraces with number of brace pairs or if braces are inbalanced -1
  */
  public static Integer numberOfBracePairs( String braces ) {
    System.out.println(braces);
    //note in eclipse would refactor variable numbOfBraces to numbOfBracePairs for clarity
    int numOfBraces=0;
    int invalid=-1;
    
    int countOpenParen=0;
    int countClosedParen=0;
    int countOpenCurlys=0;
    int countClosedCurlys=0;
    int countOpenSquare=0;
    int countClosedSquare=0;
    
   
    if (StringEven(braces)){
      
      if (!checkIfStartsWithClosingBrace(braces)){
        
          for (int loop =0; loop<braces.length(); loop++){
            switch(braces.charAt(loop)){
              case '(':
                          countOpenParen++;
                          break;
              case ')': 
                          countClosedParen++;
                          break;
              case '{': 
                          countOpenCurlys++;
                          break;
              case '}': 
                          countClosedCurlys++;
                          break;
              case '[':
                           countOpenSquare++;
                           break;
              case ']': 
                          countClosedSquare++;
                          break;
            }
          }
      
              if (checkbrackets(countOpenParen,  countClosedParen, countOpenCurlys, countClosedCurlys,  countOpenSquare,   countClosedSquare)){
                 //divided by two two find the number of pairs 
                 numOfBraces=sumNumOfBrackets(countOpenParen,  countClosedParen, countOpenCurlys, countClosedCurlys,  countOpenSquare,   countClosedSquare)/2;
              }else{
        numOfBraces=invalid;
      }
        
      }else{
        numOfBraces=invalid;
      }
      
    }else {
      numOfBraces=invalid;
    }
    
    return numOfBraces;
  }
  
  /**
  *method to determine if a strings length is even or odd
  *@return booelan isEven
  */
  public static boolean StringEven(String braces){
    boolean isEven=false;
    if (braces.length()%2==0){
      isEven=true;
    }
    
    return isEven;
  }
  
  /**
  *method top check if one open  brackets count equals its closing brackets count 
  *@return booelan even
  */
  public static boolean bracketsCountsEven(int openBrackets, int closedBrackets ){
    boolean even=false;
    if (openBrackets==closedBrackets){
      even=true;
    }
    return even;
  }
  
  /**
  *method to check if all bracket open and closing counts are equal 
  *@return booelan countsEqual 
  */
  public static boolean checkbrackets (    int countOpenParen, int countClosedParen, int countOpenCurlys, int countClosedCurlys, int countOpenSquare,  int countClosedSquare){
    boolean countsEqual=false;
      if( (bracketsCountsEven(countOpenParen,countClosedParen))&&(bracketsCountsEven(countOpenCurlys,countClosedCurlys))&&(bracketsCountsEven(countOpenSquare,countClosedSquare))){
        countsEqual=true;
      }
    return countsEqual;
  }
  
  /**
  *method to return the total number of braces in string 
  *@return int sum of all braces 
  */
  public static int sumNumOfBrackets(int countOpenParen, int countClosedParen, int countOpenCurlys, int countClosedCurlys, int countOpenSquare,  int countClosedSquare){
    return countOpenParen+countClosedParen+countOpenCurlys+countClosedCurlys+countOpenSquare+countClosedSquare;
  }
  
  /**
  *incomplete method would complete with more time 
  *method to check if an opening curly has a corrssponding closing curly 
  */
  public static void checkIfOpenHasClose(String braces){
 // boolean braceOpen = false ;
    //boolean closed= false;
    for (int loop =0; loop<braces.length(); loop++){
      // if  { ( } ) opening without matching closing comes between coresponding open/close baces fail 
   // char [] bracesOpen order corresponds to char [] braces closed order therefore if a close appears before a preceding opening has closed it fails 
      //thinking two ways one iterate through the characters in the braces string use booleans 
    }
  }
  
  /*
  *method to check if a string contains one or more characters is the first character a closing brace
  @return boolean startsWithClose 
  */
  public static boolean checkIfStartsWithClosingBrace(String braces){
    boolean startsWithClose=false;
    if (braces.length()>0){
    for (int loop =0 ; loop <bracketsClosed.length ; loop++){
      if(braces.charAt(0)==bracketsClosed[loop]) {
          startsWithClose=true;
      } 
    }
       }
     return startsWithClose;
  }
}






