package javads;
import static javads.college.crudcollege;
import java.util.*;
import static javads.Etudiant.menuEtudiant;
import static javads.enseignant.menuEnseignant;

/* class users    */
public class Users {
protected int idUser;
protected int idRole;
protected String Nom;
protected String Prenom;
protected String Mail;
protected int tel;
protected String role;
protected boolean isActive;
private Etudiant etu;
private enseignant ens;
private ArrayList<Etudiant> Etudiant;


  public Users(String Nom,String prename,String Mail,int tel,String role){
	
	this.Nom=Nom;
	this.Prenom=prename;
	this.Mail=Mail;
	this.tel=tel;
	this.role=role;
}
  public String getNom() {
	  return Nom;
  }
  public String getPrenom() {
	  return Prenom;
  }
  public int getTel() {
	  return tel;
  }
  public static void menuAdmin(){
	  Scanner s=new Scanner(System.in);
		Scanner s1= new Scanner(System.in);
		Scanner scanner ;
		String Nom;
		String password;
		int c;
		do {
			System.out.println("1.creer les utilisateurs");
			System.out.println("2.activer ou desactiver des comptes");
			System.out.println("3.affecter des listes");
			System.out.println("4.Crud college");
			System.out.print("vueillez choisir : ");
			c=s.nextInt();
			switch(c) {
			case 1:
				crud();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				crudcollege();
				break;
			}
  }while(c!=0);
  }
  public static void login() {
		List<Users> user = new ArrayList<Users>();
		Scanner s=new Scanner(System.in);
		Scanner s1= new Scanner(System.in);
		Scanner scanner ;
		String Nom;
		String password;
		int c;
		do {
			System.out.println("1.Etudiant");
			System.out.println("2.Enseignant");
			System.out.println("3.Responsable");
			System.out.println("4.Admin");
			c=s.nextInt();
			
			switch(c){
			case 1:
				scanner = new Scanner(System.in);
					System.out.print("enter a name => ");
					 Nom=scanner.nextLine();
					System.out.print("enter a password => ");
					password=scanner.nextLine();
					if("raouya".equals(Nom) && "raouya".equals(password)) {
						System.out.println("login successfuly");
						menuEtudiant();
					}else {
						System.out.println("invalid informations ");
				}
				break;
			case 2:	
				scanner = new Scanner(System.in);
					System.out.print("enter a name => ");
					 Nom=scanner.nextLine();
					System.out.print("enter a password => ");
					 password=scanner.nextLine();
					if("souha".equals(Nom) && "souha".equals(password)) {
						System.out.println("login successfuly");
						menuEnseignant();
					}else {
						System.out.println("invalid informations ");
				}
			
				break;
			case 3:
				scanner = new Scanner(System.in);
					System.out.print("enter a name => ");
					 Nom=scanner.nextLine();
					System.out.print("enter a password => ");
					 password=scanner.nextLine();
					if("yaagoubi".equals(Nom) && "raouya".equals(password)) {
						System.out.println("login successfuly");
					}else {
						System.out.println("invalid informations ");
				}
				break;
			case 4:
				scanner = new Scanner(System.in);
					System.out.print("enter a name => ");
					 Nom=scanner.nextLine();
					System.out.print("enter a password => ");
					 password=scanner.nextLine();
					if("souha".equals(Nom) && "yaagoubi".equals(password)) {
						System.out.println("login successfuly");
						menuAdmin();
					}else {
						System.out.println("invalid informations ");
				}

				break;
			}
		}while (c!=0);
			}
  
public void ConsultationEmp() {}
public static void crud() {
	List<Users> user = new ArrayList<Users>();
	Scanner s=new Scanner(System.in);
	Scanner s1= new Scanner(System.in);
	int c ;
	do {
		System.out.println("1.Insert");
		System.out.println("2.display");
		System.out.println("3.search");
		System.out.println("4.update");
		System.out.println("Enter choice:");
		c=s.nextInt();
		Iterator<Users>i=user.iterator(); ;
		switch(c) {
		case 1:
			System.out.print("Enter role : ");
			String role=s1.nextLine();
			System.out.print("Enter Nom : ");
			String name=s1.nextLine();
			System.out.print("Enter Prenom : ");
			String prename=s1.nextLine();
			System.out.print("Enter Mail : ");
			String Mail=s1.nextLine();
			System.out.print("Enter tel : ");
			
			int tel=s.nextInt();
			
			user.add(new Users(name,prename,Mail,tel,role));
			break;
		case 2:
			System.out.print(user);
			break;
		case 3:
			boolean find =false;
			System.out.println("Enter a Nom : ");
			 name = s1.nextLine();
			i=user.iterator();
			while(i.hasNext()){
				Users e=i.next();
				if(e.getNom()== name)
					System.out.println(e);
					find=true;
					if(!find) {
						System.out.println("non trouvé");
					}
			}
		  break;
		   case 4:
			 find =false;
			System.out.println("Enter a Nom to update : ");
			 name = s1.nextLine();
			 ListIterator<Users>li=user.listIterator();
			while(li.hasNext()){
				Users e=li.next();
				if(e.getNom()== name)
					System.out.println("enter name");
					name=s1.nextLine();
					System.out.println("enter prenom");
					prename=s1.nextLine();
					System.out.println("enter Mail");
					Mail=s1.nextLine();
					System.out.println("enter role");
					role=s1.nextLine();
					System.out.println("enter tel");
					tel=s.nextInt();
					li.set(new Users(name,prename,Mail,tel,role));
					find=true;
					if(!find) {
						System.out.println("non trouvé");
					}else {
						System.out.println("updated");
					}
			}
		  break;	
		}
	}	
	while(c!=0);
}
 public static void main(String[] args) {
	login();
	//crud();
}
@Override
 public String toString() {
	return this.Nom+" "+ this.Prenom+" "+this.Mail+" "+this.tel;
}
} 


