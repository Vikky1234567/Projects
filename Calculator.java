 package mini_projects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] X) {
		
		boolean a=true;
		Scanner Eekshu = new Scanner(System.in);
		System.out.println("---WELCOME TO THE CALC---"); 
		
		System.out.println("ENTER THE FIRST NUMBER");
		int frst=Eekshu.nextInt();
		while (a) {
		System.out.println("ENTER THE SECOND VALUE");
		int scnd=Eekshu.nextInt();
		System.out.println("WHICH OPERATION DO YOU WANT");
		System.out.println("ENTER 1 TO ADDITION , 2 TO SUBTRACTION , 3 TO MULTIPLICATIION , 4 TO DIVSION");     
		int opt = Eekshu.nextInt();
		int result =0;
		if (opt==1) {
			result = frst+scnd;
			System.out.println("YOUR RESULT IS "+result);
		}
		else if (opt==2) {
			result = frst-scnd;
			System.out.println("YOUR RESULT IS "+result);
		}
		else if (opt==3) {
			result = frst*scnd;
			System.out.println("YOUR RESULT IS "+result);
		}
		else if (opt==4) {
			result = frst/scnd;
			System.out.println("YOUR RESULT IS "+result);
		}
		System.out.println("DO YOU TO CONTINUE THE OPERATION...?? (YES/N0)");
		String cont = Eekshu.next();
		if (cont.equalsIgnoreCase("yes")) {
			
			System.out.println("CONTINUE WITH 'SAME' OR 'DIFFERENT'...??");
			String sameopt= Eekshu.next();
			
			if (sameopt.equalsIgnoreCase("same")) {
				System.out.println("CONTINUING WITH SAME VALUE "+result);
				frst=result;
			}
			else if (sameopt.equalsIgnoreCase("different")) {
				System.out.println("COUNTINUING WITH DIFFERENT VALUE");
				System.out.println("ENTER A FIRST NUMBER");
				int thrd = Eekshu.nextInt();
				frst = thrd;
			}
			}
		else if(cont.equalsIgnoreCase("no")) {
				a=false;
				System.out.println("THANKS FOR USING OUR CALC...!!");
			}
		}
	
	}

}
