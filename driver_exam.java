/************************************************************/
/*Program:  Driver's License Exam                           */
/*CIS163AA                                                  */
/*Jaime Barentine                                          */
/*11/22/2022                                              */
/*grades the written portion of the driver's license exam*/
/********************************************************/


import java.util.Scanner;
import java.io.*;


public class driver_exam
{

   // class that returns true if score is above 15
   public static boolean passed(int score)
   {
      if(score > 14)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   // class that returns the total number of correctly answered questions
   public static int totalCorrect(int score)
   {
      return score;
   }
   
   // class that returns the total number of incorrectly answered questions
   public static int totalIncorrect(int incorrect)
   {
      return incorrect;
   }
   
   // class that prints out which questions were missed
   public static void questionsMissed(int[] wrong_answers)
   {
   
      for(int i=0; i < 20; i++)
      {
      
         if(wrong_answers[i] > 0)
         {
            System.out.print(wrong_answers[i] + 1 + " ");
         }
      }
      
      if(wrong_answers[19] > 0)
      {
         System.out.print(wrong_answers[19] + 1 + "\n");
      }
      
   }
    
   public static void main(String[] args)
   {
      // initialize the correct answers
      String[] answers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
      // array for containing the student's answers
      String[] student = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
      // array for storing which questions were wrong
      int[] wrong_answers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      // vals that keeps track of the number of questions correct or missed
      int score = 0;
      int incorrect = 0;
   
      // initializes the keyboard for input
      Scanner keyboard = new Scanner(System.in);
   
      System.out.print("Enter the answers from the driver's exam test:\n");
      
      // loop that asks the user to enter student answers
      for(int i = 0; i < 20; i++)
      {
         String keyInput;
         System.out.print("Enter answer for " + (i + 1) + "\n");
         keyInput = keyboard.nextLine();
         
         // stays in a while loop asking for A B C or D if another value is entered
         while(!keyInput.equals("A") && !keyInput.equals("B") && !keyInput.equals("C") && !keyInput.equals("D"))
         {
            System.out.print("Invalid input. Please enter A, B, C, or D\n");
            keyInput = keyboard.nextLine();
         }
         
         // adds the user's input to the array of student answers
         student[i] = keyInput;
      }
      
      // grades the student's score by comparing each of the student's answers to the answer key's array
      for(int i=0; i < 20; ++i)
      {
         if(answers[i].equals(student[i]))
         {
            score += 1;
         }
         else
         {
            // counts and adds the incorrect question numbers to an array
            wrong_answers[incorrect] = i;
            incorrect += 1;
         }
      }
      
      // prints out the student's score, total incorrect
      System.out.print("Score: " + totalCorrect(score) + "\nIncorrect: " + totalIncorrect(incorrect) + "\nWrong answers were:\n");
      // prints out which questions were answered incorrectly
      questionsMissed(wrong_answers);
      
      // prints out whether or not the student passed
      if(passed(score))
      {
         System.out.print("\nYou passed!");
      }
      else
      {
         System.out.print("\nYou failed, I suppose you should pay another $20 fee to the MVD if you want to try again.");
      }
      
   }
   
}

