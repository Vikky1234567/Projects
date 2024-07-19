package mini_projects;

import java.util.Scanner;

public class PIZZA_ORDER {

	public static void main(String[] args) {
		Scanner EEKSHU= new Scanner(System.in);
		boolean a=true;
		int totalbill=0;
		
		
		System.out.println("-----HELLO WELCOME TO OUR PIZZA RESTAURANT-----");
		System.out.println("     ----WHICH SIZE OF PIZZZA YOU WANT---- ");
		int pizzaprice = 0;
		while(a) {
		System.out.println("1.SMALL--(if you want small enter 1)");
		System.out.println("2.MEDIUM-(if you want medium enter 2)");
		System.out.println("3.LARGE--(if you want large enter 3)");
		int size=EEKSHU.nextInt();
		switch (size) {
		case 1:
			pizzaprice=pizzaprice+100;
			System.out.println("YOU ARE SELECTED 'SMALL' SIZE PIZZA AND IT'S PRICE IS - "+pizzaprice);
			break;
		case 2:
			pizzaprice=pizzaprice+150;
			System.out.println("YOU ARE SELECTED 'MEDIUM' SIZE PIZZA AND IT'S PRICE IS - "+pizzaprice);
			break;
		case 3:
			pizzaprice=pizzaprice+200;
			System.out.println("YOU ARE SELECTED 'LARGE' SIZE PIZZA AND IT'S PRICE IS - "+pizzaprice);
			break;
		default : 
			System.out.println("INVALID");
			return;
		}
		//PEPPERONI
		System.out.println("DO YOU WANT PEPPERONI...?? (yes/no)");
		String pepperoni =EEKSHU.next();	
		int pepperoniprice =0;
		if(pepperoni.equalsIgnoreCase("yes")) {
			pepperoniprice = 20;
			System.out.println("PIZZA + PEPPERONI(20rs)");
		}
		else if(pepperoni.equalsIgnoreCase("no")) {
			pepperoniprice = 0;
			
		}
		//CHEESE
		System.out.println("DO YOU WANT EXTRA CHEESEE...??(yes/no)");
		String cheese=EEKSHU.next();
		int cheeseprice = 0;
		
		switch(size) {
		case 1 :
			if (cheese.equalsIgnoreCase("yes")) {
		          cheeseprice = 20;
		          System.out.println("PIZZA + PEPPERONI(20rs) + EXTRA CHEESE(20rs)");
			}
			break;
		case 2 :
			if (cheese.equalsIgnoreCase("yes")) {
		          cheeseprice = 30;
		          System.out.println("PIZZA + PEPPERONI(20rs) + EXTRA CHEESE(30rs)");
			}
			break;
		case 3 :
			if (cheese.equalsIgnoreCase("yes")) {
		          cheeseprice = 50;
		          System.out.println("PIZZA + PEPPERONI(20rs) + EXTRA CHEESE(50rs)");
			}
			break;
		default :
			System.out.println("INVALID");
			return;
		}
		//ANOTHER ORDER
		System.out.println("DO YOU WANT TO MAKE ANOTHER ORDER");
		System.out.println("enter 1 for 'yes' , 2 for 'no'");
		int nxtorder = EEKSHU.nextInt();
		if (nxtorder==2) {
			a=false;
		}
		if(nxtorder==1) {
			System.out.println("same bill(enter 1) or different bill(enter 0)");
			int bills = EEKSHU.nextInt();
			
			if(bills==1) {
				System.out.println("CONTINUING WITH SAME BILL");
				totalbill=totalbill;
			}
			if(bills==0) {
				totalbill=totalbill-totalbill;
			}
			
		}
		 
		totalbill= pizzaprice + pepperoniprice + cheeseprice;
		
		
		}
		System.out.println("YOUR TOTAL BILL IS "+totalbill);
		System.out.println("THANKS FOR ORDERING...!! SEE YOU NEXT TIME...!!");
	}

}
