package com.wilmington.subject.task;

import java.util.Scanner;

public class vending1 {
	static double Drinks = 0.02;
	static String Snacks = "no tax";
	static String Sandwitch = "no tax";
	static double icecream = 0.05;
	
	
	static int DrinksPrice = 10;
	static int SnacksPrice = 15;
	static int sandwitchprice = 20;
	static int icecreamprice = 5;
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(retrievePrice());
	    @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
	    int choice = 0 ;
	    
	    System.out.println("\n\nPlease enter your selection:"
	                + "\n1: Drinks \t "
	                + "\n2: Snacks \t "
	                + "\n3: Sandwitch \t"
	                + "\n4: icecream \t"
	                + "\n5: Exit \t");
	    choice = keyboard.nextInt(); 
	switch(choice)
    
    {
        case 1:
             
        	System.out.println("\n\nSelect your Choice:"
	                + "\n1: Coke \t "
	                + "\n2: Pepsi \t ");
        	
choice = keyboard.nextInt();
        	
        	double total = Drinks*DrinksPrice;
        	if (choice == 1)
        	{
        		
        		System.out.println("\n\n Product Details:"
        				+ "\n ProductName \t" + "Price \t" +"Tax \t" + "Total"
    	                + "\n Coke \t " +"\t"+ DrinksPrice +"\t"+ Drinks + "\t" + (DrinksPrice+total)
    	               
    	                );
        		
        	}
        	else if (choice == 2){
        		{
            		System.out.println("\n\n Product Details:"
            				+ "\n ProductName \t" + "Price \t" +"Tax \t" + "Total"
        	                + "\n Pepsi \t " +"\t"+ DrinksPrice +"\t"+ Drinks + "\t" + (DrinksPrice+total)
        	                );
            		
            	}
        	}
        	 break;
        case 2:
            
        	System.out.println("\n\nSelect your Choice:"
	                + "\n1: Choclates \t "
	                + "\n2: Biscuits \t ");
        	
 choice = keyboard.nextInt();


        	
           
           
        	if (choice == 1)
        	{
        		System.out.println("\n\n Product Details:"
        				+ "\n ProductName \t" + "Price \t" +"Tax \t" + "Total"
    	                + "\n Choclates \t "+ SnacksPrice +"\t"+ Snacks + "\t" + (SnacksPrice)
    	                );
        		break;
        	}
        	else if (choice == 2){
        		{
            		System.out.println("\n\n Product Details:"
            				+ "\n ProductName \t" + "Price \t" +"Tax \t" + "Total"
        	                + "\n Biscuits \t "+ SnacksPrice +"\t"+  Snacks  + "\t" + (SnacksPrice)
        	                );
        		}
        	}
        	 break;	
        	 case 3:
                 
             	System.out.println("\n\nSelect your Choice:"
     	                + "\n1: vegiee \t "
     	                + "\n2: meat \t ");
             	
             	choice = keyboard.nextInt();
             	if (choice == 1)
             	{
             		System.out.println("\n\n Product Details:"
             				+ "\n ProductName \t" + "Price \t" +"Tax \t" + "Total"
         	                + "\n vegiee \t "+ sandwitchprice +"\t"+ Sandwitch + "\t" + (sandwitchprice)
         	                );
             		break;
             	}
             	else if (choice == 2){
             		{
                 		System.out.println("\n\n Product Details:"
                 				+ "\n ProductName \t" + "Price \t" +"Tax \t" + "Total"
             	                + "\n meat \t "+"\t"+ sandwitchprice +"\t"+  Sandwitch  + "\t" + (sandwitchprice)
             	                );
                 	}
        } break;
        	 case 4:
                 
              	System.out.println("\n\nSelect your Choice:"
      	                + "\n1: venila \t "
      	                + "\n2: strawberry \t ");
              	
              	choice = keyboard.nextInt();
              	if (choice == 1)
              	{
              		System.out.println("\n\n Product Details:"
              				+ "\n ProductName \t" + "Price \t" +"Tax \t" + "Total"
          	                + "\n venila \t "+ icecreamprice +"\t"+ icecream + "\t" + (icecreamprice+(icecream*icecreamprice))
          	                );
              		break;
              	}
              	else if (choice == 2){
              		{
                  		System.out.println("\n\n Product Details:"
                  				+ "\n ProductName \t" + "Price \t" +"Tax \t" + "Total"
              	                + "\n strawberry \t "+ icecreamprice +"\t"+  icecream  + "\t" + (icecreamprice+(icecream*icecreamprice))
              	                );
                  	}
              	}
        	 case 5:
        		 System.out.println("Thank you visit again");
    }
	}
}
         
        	
        	

	






	



	
		
	
