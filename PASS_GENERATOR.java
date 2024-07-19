package mini_projects;
import java.util.*;
public class PASS_GENERATOR {

	public static void main(String[] args) {
		
		Scanner eekshu = new Scanner(System.in);
		Random vikky=new Random();
		
		System.out.println("welcome to pass generator");
		
		//0 -25      1-26 
		String cap_letter[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String sml_letter[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		//0-9        0-9
		String num [] = {"1","2","3","4","5","6","7","8","9","0"};
		//0-10      
		String chars [] = {"!","@","#","$","%","^","&","*","}","_","/"};
		
		String pass=" ";
		
		System.out.println("HOW MANY CAPITALS LETTERS DO YOU WANT...??");
		int a=eekshu.nextInt();
		for (int i=1;i<=a;i++) {
			String cl = cap_letter[vikky.nextInt(cap_letter.length)];
			pass=pass+cl;
		}
		System.out.println("HOW MANY SMALL LETTERS DO YOU WANT...??");
		int b=eekshu.nextInt();
		for (int i=1;i<=b;i++) {
			String sl = sml_letter[vikky.nextInt(sml_letter.length)];
			pass=pass+sl;
		}
		
		System.out.println("HOW MANY SPECIAL SYMBOLS DO YOU WANT...??");
		int d=eekshu.nextInt();
		for (int i=1;i<=d;i++) {
			String C = chars[vikky.nextInt(chars.length)];
			pass=pass+C;
		}
		System.out.println("HOW MANY DIGITS DO YOU WANT...??");
		int c=eekshu.nextInt();
		for (int i=1;i<=c;i++) {
			String n = num[vikky.nextInt(num.length)];
			pass=pass+n;
		}
		System.out.println("YOUR PASSWORD IS"+pass);
		System.out.println("---THANKS FOR VISITING---");
		}

}
