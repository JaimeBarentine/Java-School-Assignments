/*************************************************************/
/*Program:     Ship class                                    */
/*CIS163AA                                                   */
/*Jaime Barentine                                            */
/*12/10/2022                                                 */
/* Holds information about ships                             */
/*************************************************************/


import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Ship
{
   // declare the ship class's base variables
   private String shipName;
   private String yearBuilt;
   
   // sets the values to empty if nothing is entered
   public Ship()
   {
      shipName = " ";
      yearBuilt = " ";
   }
   
   // sets variables to values when ship object created
   public Ship(String name, String year)
   {
      shipName = name;
      yearBuilt = year;
   }
   
   // sets the name of the ship
   public void setName(String name)
   {
      shipName = name;
   }
   
   // gets the name of the ship
   public String getName()
   {
      return shipName;
   }
   
   // prints the ship's name and year built
   public void printInfo()
   {
      System.out.println("Name: " + shipName + "\nYear built: " + yearBuilt);
   }
   
}
