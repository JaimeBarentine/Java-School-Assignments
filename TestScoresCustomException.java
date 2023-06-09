/*************************************************************/
/*Program:     Test Scores Custom Exception                  */
/*CIS163AA                                                   */
/*Jaime Barentine                                            */
/*12/15/2022                                                 */
/*Modified TestScores to throw an InvalidTestScore exception */
/*************************************************************/


import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.InputMismatchException;


public class TestScoresCustomException
{
   // initialize the array to hold scores
   private int[] currentScores;
   
   // defines the constructor of the TestScores class to accept an array of scores
   public TestScoresCustomException(int[] scores)
   {
      currentScores = scores;
   }
   
   // returns the average of this object's scores
   public int ScoreAverage()
   {
       int tempAvg = 0;
       for(int i = 0; i < currentScores.length; i++)
       {
         tempAvg += currentScores[i];
       }
       return (tempAvg / currentScores.length);
   }
   
   // main loop that runs the program
   public static void main(String[] args)
   {
   
      // sets up an empty array for user input
      int[] theseScores = {15, 25, 50, 75, 100, 0, -50};
      
      // int to prevent both exception from being thrown at the same time
      int errorHit = 0;
      
      // initialize the keyboard
      Scanner keyboard = new Scanner(System.in);
      
      // int that stores the next user input
      int thisScore = 0;
      
      try
      {
         // steps through the array that stores user inputs
         for(int i = 0; i < theseScores.length; i++)
         {
            
            System.out.print("Enter score " + (i + 1) + ": ");
            // stores the user input to the temp variable
            thisScore = keyboard.nextInt();
            
            // throws InvalidTestScore if the score is out of range
            if(thisScore > 100 || thisScore < 0)
            {
               errorHit = 1;
               // custom error class InvalidTestScore in use
               throw new InvalidTestScore("Error: Please enter a score between 0 and 100");
            }
            else
            {
               // if score within range, add the user input to the user array
               theseScores[i] = thisScore;
            }
         }
         
         // creates an object of the TestScores class with the user array as the argument
         TestScores scoresObj = new TestScores(theseScores);
         
         // prints the average from the ScoreAverage method in TestScore
         System.out.print("The average of the scores is: " + scoresObj.ScoreAverage());
      }
      catch(Exception e)
      {
         // throws an exception if the input isn't an int
         if(errorHit == 0)
         {
            System.out.print("Error: Input type must be an int");
         }
      }
   }

}

