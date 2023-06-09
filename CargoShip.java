/*************************************************************/
/*Program:     Cargo Ship class                              */
/*CIS163AA                                                   */
/*Jaime Barentine                                            */
/*12/10/2022                                                 */
/* Extends the members of the Ship class                     */
/*************************************************************/


import java.util.Scanner;
import java.util.*;
import java.io.*;


public class CargoShip extends Ship
{
   // value for a cargo ship's capacity
   private String cargoCapacity;
     
   
   // sets the name and capacity value when CargoShip instance is created
   public CargoShip(String name, String capacity)
   {
      setName(name);
      cargoCapacity = capacity;
   }
   
   // override for toString that only prints the ship's name and cargo capacity
   public final void printInfo()
   {
      System.out.println("Name: " + getName() + "\nMax cargo capacity: " + cargoCapacity);
   }
   
}

