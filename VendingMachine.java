package com.java.collections;
import java.util.Scanner;

public class VendingMachine 
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
	    chooseProduct(console);
	 }

	private static void printOptions() 
	{
		System.out.println("\nVending Machine");
		System.out.println("List of items ");
	    System.out.println("1. Drinks ");
	    System.out.println("2. Snacks ");
	    System.out.println("3. Sandwitch ");
	    System.out.println("4. Icecream ");
	    System.out.println("\nPlease select from the options");
	}

	private static void chooseProduct(Scanner console) 
	{
		printOptions();
		
		int choice = 0;
		try
		{
			console = new Scanner(System.in);
			choice = console.nextInt();
		} 
		catch (Exception e)
		{
			choice = 0;
		} 
		
	     chooseOption(choice);
	}

	private static void chooseOption(int choice) 
	{
		switch(choice)
	     {
	     	case 1:
		    	 System.out.println("5.pepsi");
		    	 System.out.println("6.coke");
		    	 System.out.println("select your choice:");
		         String tax ="2%";
		         choice = console.nextInt();
		         
			     if(choice ==5)
				 {   
			    	String pepsi="pepsi";
			 		int pepsiprice=10;
			 		double total =pepsiprice+(pepsiprice*0.02);
			 		printItemHeader();
			        printItemDetails(tax, pepsi, pepsiprice, total);
				 }
			     else if(choice ==6)
			     {  
				    String coke="coke";
			 		int cokeprice=20;
			 		double total2 = cokeprice+(cokeprice*0.02);
			 		printItemHeader();
			        printItemDetails(tax, coke, cokeprice, total2);
			     }
			     
			     break;
	     	case 2:
		    	 System.out.println("7.cookies");
		    	 System.out.println("8.cake");
		    	 System.out.println("select your choice:");
		          String tax1 ="no tax";
		          choice = console.nextInt();
			     if(choice ==7)
			     {   
			    	String cookie="cookie";
			 		int cookieprice=10;
			 		double total =cookieprice;
			 		printItemHeader();
			        printItemDetails(tax1, cookie, cookieprice, total);
			     }
			     else if(choice ==8)
			     {  
				    String cake="cake";
			 		int cakeprice=20;
			 		double total2 = cakeprice;
			        printItemHeader();
			        printItemDetails(tax1, cake, cakeprice, total2);
				 }
		    
			     break;
	     	case 3:
		    	 System.out.println("9.veggie");
		    	 System.out.println("10.chicken");
		    	 System.out.println("select your choice:");
		          String tax3="no tax";
		          choice = console.nextInt();
			     if(choice ==9)
				 {   
			    	String veggie="veggie";
			 		int veggieprice=10;
			 		double total =veggieprice;
			 		printItemHeader();
			 		printItemDetails(tax3, veggie, veggieprice, total);
			        
				 }
			     else if(choice ==10)
			     {  
				    String chicken="chicken";
			 		int chickenprice=20;
			 		double total2 = chickenprice;
			 		printItemHeader();
			 		printItemDetails(tax3, chicken, chickenprice, total2);
				 }
			     break;
	     	case 4:
		    	 System.out.println("11.strawberryice");
		    	 System.out.println("12.vennila ice");
		    	 System.out.println("select your choice:");
		          String tax5="5%";
		          choice = console.nextInt();
			     if(choice ==11)
				 {   
			    	String strawberry="strawberryice";
			 		int strawberryprice=10;
			 		double total =strawberryprice+(strawberryprice*0.05);
			 	    printItemHeader();
			        printItemDetails(tax5, strawberry, strawberryprice, total);
			        
				 }
			     else if(choice ==12)
			     {  
				    String vennila="vennilaice";
			 		int vennilaprice=20;
			 		double total2 = vennilaprice+(vennilaprice*0.05);
		
			 		printItemHeader();
			 		printItemDetails(tax5, vennila, vennilaprice, total2);
				 }
			     break;
	     	default:
	     		chooseProduct(console);
	     		break;
	     }
	}

	private static void printItemDetails(String tax, String productName, int productPrice,  double total)
	{
		System.out.println(productName+ "    " +productPrice+ "   " +  tax + "  "   + "  " +total);
		
		System.out.println("Thanks for shopping with us !!!");
		chooseProduct(console);
	}

	private static void printItemHeader() 
	{
		System.out.println("Item   Price   Tax  Total");
	}
}