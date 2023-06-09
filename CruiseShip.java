/*************************************************************/
/*Program:     Cruise Ship class                             */
/*CIS163AA                                                   */
/*Jaime Barentine                                            */
/*12/10/2022                                                 */
/* Extends the members of the Ship class                     */
/*************************************************************/


import java.util.Scanner;
import java.util.*;
import java.io.*;


public class CruiseShip extends Ship
{
   // variable for maximum number of passengers
   private String maxPassenger;
   
   // sets the values when a new CruiseShip instance is created
   public CruiseShip(String name, String max)
   {
      setName(name);
      maxPassenger = max;
   }
   
   // override that prints out only the name and max number of passengers
   public final void printInfo()
   {
      System.out.println("Name: " + getName() + "\nMax passengers: " + maxPassenger);
   }
   
}

