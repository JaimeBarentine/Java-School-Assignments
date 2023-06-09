/************************************************************/
/*Program:  Distance traveled                               */
/*CIS163AA                                                  */
/*Jaime Barentine                                          */
/*11/02/2022                                              */
/* calculate the distance a car traveled                  */
/************************************************************/

import java.util.Scanner;

public class jaime_barentine_distance_traveled
{
   public static void main(String[] args)
   {
      double mph;
      double hours;
      double distance;
            
      mph = -1;
      hours = 0;
      
      
      // create a scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // makes sure the value is positive or 0
      while(mph < 0)
      {
      // prompt the user to enter mph
         System.out.print("Enter the speed of a vehicle (in mph):\n");
         mph = keyboard.nextDouble();
      }
      
      // makes sure the value is greater than 0
      while(hours <= 0)
      {
      // prompt the user to enter how long the vehicle traveled
         System.out.print("Enter the number of hours it traveled:\n");
         hours = keyboard.nextDouble();
      }
      
      // calculate and print the distance
      distance = mph * hours;
      System.out.print("The vehicle traveled " + distance + " miles.");
      
   }
}