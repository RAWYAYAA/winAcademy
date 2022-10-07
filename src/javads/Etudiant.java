package javads;

import java.util.Scanner;

public class Etudiant extends Users {
private String date_ec;
public Etudiant(String Nom, String prename, String Mail, int tel,String role) {
		super(Nom, prename, Mail, tel,role);
		// TODO Auto-generated constructor stub
	}

public static void menuEtudiant() {
	int c;
	Scanner s=new Scanner(System.in);
	System.out.println("******** Hello Student ********");
	System.out.println("1.consulter les notes");
	System.out.println("2.modifier le compte");
	c=s.nextInt();
	switch(c) {
	case 1:
		break;
	case 2:
		break;
	
	}
}
}
