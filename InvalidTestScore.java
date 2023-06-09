/*************************************************************/
/*Program:     Invalid Test Score                            */
/*CIS163AA                                                   */
/*Jaime Barentine                                            */
/*12/15/2022                                                 */
/*A custom error class for TestScoresCustomException to call */
/*************************************************************/


import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.InputMismatchException;


public class InvalidTestScore extends Exception
{
  
   
   // defines the constructor of the TestScores class to accept an array of scores
   public InvalidTestScore(String message)
   {
      // prints out the argument
      System.out.print(message);
   }
   
   
}

