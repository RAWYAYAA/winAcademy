package javads;
import java.util.Scanner;

public class challenge {
	public static void printTriangle() {
		 Scanner myObj = new Scanner(System.in);  
		    System.out.println("Enter a symbole  ");
		    String symbol = myObj.nextLine(); 
		    int nbEspace;
		    int symbole ;
		    do {
		    	Scanner hisObj = new Scanner(System.in);  
			    System.out.println("Enter a number between 8 et 35");
		    	 symbole=hisObj.nextInt();
		    }while(symbole < 8 || symbole > 35);
			for(int i=1
					; i<=symbole; i++){ 
				for(int k=symbole-i; k>0 ; k-- ) {
					System.out.print(" ");
				}
	            for(int j=0; j <(i*2)-1; j++){
	         	   System.out.print(symbol);
	            }          
	            System.out.println(" ");
	         }}
	
	public static void main(String[] args) {
		  printTriangle(); 
}	
}
/*public interface print{
}
	public class lambdas{
		public static void main(String[] args) {
			optimize()
		()->{
			System.out.println("meow");
		});	
		}
	}
*/
