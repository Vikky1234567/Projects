package mini_projects;
import java.util.Scanner;
import java.util.Random;
public class Stone_papper_scissors {

	public static void main(String[] args) {
		
		Scanner Eekshu = new Scanner(System.in);
		Random vikky = new Random();
		
		boolean a=true;
		
		while (a) {
			System.out.println("WELCOME TO STONE PAPPER AND SCISSOR GAME");
			System.out.println("STONE - 0 , PAPPER - 1 , SCISSOR - 2 ");
			int user_choice = Eekshu.nextInt();
			
			// <3 IT PICKS GIVEN NUMBER - 1
			int comp_choice = vikky.nextInt(3);
			
			//Displaying
			if (comp_choice==0) {
				System.out.println("COMPUTER CHOOSES STONE");
			}
			if (comp_choice==1) {
				System.out.println("COMPUTER CHOOSES PAPPER");
			}
			if (comp_choice==2) {
				System.out.println("COMPUTER CHOOSES SCISSOR");
			}
			
			//COMPARING EACH OTHER CHOICES
			
			if (user_choice==comp_choice){
				System.out.println("IT'S A DRAW");
			}
			else if(comp_choice>user_choice) {
				System.out.println("COMPUTER WINS");
			}
			else if(user_choice>comp_choice) {
				System.out.println("YOU WINS");
			}
			else if((comp_choice==0)&&(user_choice==2)) {
				System.out.println("COMPUTER WINS");
			}
			else if((user_choice==0)&&(comp_choice==2)) {
				System.out.println("YOU WINS");
			}
			
			System.out.println("DO YOU WANT TO CONTINUE THE GAME");
			System.out.println("1 for yes , 2 for no");
			int cont =Eekshu.nextInt();
			if (cont==1) {
				a=true;
			}
			else if(cont==0) {
				a=false;
				System.out.println("THANK YOU...!!");
			}
			
		}
		
	}

}
