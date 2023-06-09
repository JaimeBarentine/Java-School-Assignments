/************************************************************/
/*Program:  Rectangle area                                   */
/*CIS163AA                                                  */
/*Jaime Barentine                                          */
/*11/09/2022                                              */
/*calculates and displays the area of a rectangle.       */
/********************************************************/


import java.util.Scanner;
import java.io.*;


public class jaime_barentine_AreaRectangle
{

   // asks for the length and returns keyboard input 
   public static double getLength()
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Enter the length:\n");
         double response;
         response = keyboard.nextDouble();
         return response;
   }
   
   // asks for the width and returns keyboard input
   public static double getWidth()
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Enter the width:\n");
         double response;
         response = keyboard.nextDouble();
         return response;

   }
   
   // calculates and returns the product of the length and the width
   public static double getArea(double length, double width)
   {
      return (length * width);
   }
   
   // displays the data and area of the rectangle
   public static void displayData(double length, double width, double area)
   {
      System.out.print("The rectangle's length is: " + length + "\nThe rectangle's width is: " + width + "\nThe rectangle's area is: " + area);
      
   }

   public static void main(String[] args)
   {
   
      Scanner keyboard = new Scanner(System.in);

   
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }
}

