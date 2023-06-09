/*************************************************************/
/*Program:     Test Scores                                   */
/*CIS163AA                                                   */
/*Jaime Barentine                                            */
/*12/15/2022                                                 */
/* Throws an exception if test scores are incorrect          */
/*************************************************************/


import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.InputMismatchException;


public class TestScores
{
   // initialize the array to hold scores
   private int[] currentScores;
   
   // defines the constructor of the TestScores class to accept an array of scores
   public TestScores(int[] scores)
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
            
            // throws an IllegalArgumentException if the score is out of range
            if(thisScore > 100 || thisScore < 0)
            {
               throw new IllegalArgumentException("");
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
         // throws an exception if the score is out of range, or the input isn't an int
         throw new IllegalArgumentException("Error: Invalid test score input");
      }
   }

}

