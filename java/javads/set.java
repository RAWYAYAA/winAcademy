package javads;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class set {
	public static void main(String[] args) {
		TreeSet<String> sett = new TreeSet<String>();//data unordred but's alphabeticaly sorted

		HashSet<String> set = new HashSet<String>();
		//data isn't added as in indexing approach 
		//we got hachcodes for elements wich are being added
		set.add("john");
		set.add("jenniie");
		set.add("jim");
		set.add("john");
		System.out.println("set is "+set);
		//no repeat data
		//data is unordred in outpout due to hashing
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
	}
}

