/*package javads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void login() {
		List<Users> user = new ArrayList<Users>();
		Scanner s=new Scanner(System.in);
		Scanner s1= new Scanner(System.in);
		int c;
		do {
			System.out.println("1.Etudiant");
			System.out.println("2.Enseignant");
			System.out.println("3.Responsable");
			System.out.println("3.Admin");
			c=s.nextInt();
			switch(c){
			case 1:
				if("Raouya".equals(userName) && "Raouya".equals(password)) {
					System.out.println("login successfuly");
				}else {
					System.out.println("invalid informations ");
			
			}
			}while (c!=0);
		

		/*switch(c) {}
		
		if("Raouya".equals(userName) && "Raouya".equals(password)) {
			System.out.println("login successfuly");
		}else {
			System.out.println("invalid informations ");
		}*/
	}

	/*public static void main(String[] args) {
		login();
	}
}
*/