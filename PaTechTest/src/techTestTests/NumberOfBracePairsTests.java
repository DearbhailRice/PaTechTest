package techTestTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import techTestMethods.Challenge;

import static org.junit.Assert.*;
public class NumberOfBracePairsTests {
  @Test
  public void shouldReturn0Pairs() {
    Integer expected0 = 0;
    Integer actual0 = Challenge.numberOfBracePairs("");
    assertEquals(expected0, actual0);
  }
  @Test
  public void shouldReturnInvalidBecauseUnclosedBrace() {
    Integer expected0 = -1;
    Integer actual0 = Challenge.numberOfBracePairs("{[}");
    assertEquals(expected0, actual0);
  }
  @Test
  public void shouldReturn2Pairs() {
    Integer expected0 = 2;
    Integer actual0 = Challenge.numberOfBracePairs("{}[]");
    assertEquals(expected0, actual0);
  }
  
     @Test
  public void shouldReturnInvalidBecauseBraceClosesbeforeInner() {
    Integer expected0 = -1;
    Integer actual0 = Challenge.numberOfBracePairs("[(])");
    assertEquals(expected0, actual0);
  }
  /**
  *own test case for brackets closing with an unclosed brace inside 
  */
  @Test
  public void shouldReturnInvalidBecauseUnevenbrackets() {
    Integer expected0 = -1;
    Integer actual0 = Challenge.numberOfBracePairs("[({})](]");
    assertEquals(expected0, actual0);
  }
  
  /**
  *own test case checks string does not start with a closing brace 
  */
   @Test
  public void shouldReturnInvalidBecauseStartswithCloseBrace() {
    Integer expected0 = -1;
    Integer actual0 = Challenge.numberOfBracePairs("}[]");
    assertEquals(expected0, actual0);
  }
  
}
