package com.mycompany.party;

import java.util.Scanner;

/**
 *
 * @author ENGEDZANI
 */
public class UseDinnerParty {

public static void main(String[] args) 
  {
   int choice;
   int guests;
   
   DinnerParty aDinnerParty = new DinnerParty();
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Enter number of guest for the dinner Party >> ");
   guests = keyboard.nextInt();
   aDinnerParty.setGuest(guests);
   
   
   System.out.println("Enter the menu option -- 1 for chicken ot 2 for beef >> ");
   choice = keyboard.nextInt();
   aDinnerParty.setDinnerChoice(choice);
   System.out.println("The party has " + aDinnerParty.getGuest() + " guests");
   
   System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " Will be served");
   
   aDinnerParty.displayInvation();
   
  }    
}
    

