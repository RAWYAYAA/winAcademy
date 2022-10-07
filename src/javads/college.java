package javads;
import java.util.ArrayList;
import java.util.*;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;



public class college {
	private int idCollege;
	private String Nom;
	private departement dep;
	private ArrayList<departement> depa;
	
 college(int idCollege, String Nom) {
	this.idCollege=idCollege;
	this.Nom=Nom;
}
 public int getIdColleg(){
	 return idCollege;
 }
 public String getNom() {
	 return Nom;
 }
 public String toString() {
	 return idCollege+" "+Nom+" ";
 }

	 public static void crudcollege() {
		 Collection<college> c=new ArrayList<college>(); 
		 Scanner in=new Scanner(System.in);
		 Scanner s=new Scanner(System.in);
		 int choix;
		 do {
			System.out.println("1.inserer"); 
			System.out.println("2.afficher");
			System.out.println("3.chercher");
			System.out.println("Entrer votre choix : ");
			choix=s.nextInt();
			switch(choix){
			case 1: 
				System.out.print("Enter an id : ");
				int idCollege=s.nextInt();
				System.out.print("Enter a name : ");
				s.nextLine();
				String Nom=s.nextLine();
				
				c.add(new college(idCollege,Nom));
				break;
			case 2:
				System.out.println("////");
				Iterator<college> i=c.iterator();
				while(i.hasNext()) {
					college e=i.next();
					System.out.println(e);
				}
				System.out.println("///////");
				break;
			case 3:
				boolean found=false;
				System.out.println("enter le nom du college");
				s.nextLine();
				Nom=s.nextLine();
				System.out.println("--------");
				 i=c.iterator();
				while(i.hasNext()) {
					college e=i.next();
					if(e.getNom().equals(Nom)) {
						System.out.println(e);
						found=true;
					}
				}
				System.out.println("--------");
				if(!found) {
					System.out.println("non trouvé");
				}
				break;
			}
		 }while(choix!=0);
}
 }
