package javads;

import java.util.Scanner;

public class enseignant extends Users {
private String date_p_f;
public enseignant(String Nom, String prename, String Mail, int tel) {
		super(Nom, prename, Mail, tel);
		// TODO Auto-generated constructor stub
	}
public static void menuEnseignant() {
	int c;
	Scanner s=new Scanner(System.in);
	System.out.println("******** Hello enseignant ********");
	System.out.println("1.consulter les notes");
	System.out.println("2.saisir les notes");
	System.out.println("2.modifier son compte");
	c=s.nextInt();
	switch(c) {
	case 1:
		break;
	case 2:
		break;
	
	}
}
}
