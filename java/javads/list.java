package javads;
import java.util.ArrayList;
import java.util.Iterator;

class student{
	int roll;
	String name;
}

public class list {
	public static void main(String[] args) {
		ArrayList<String> list1	= new ArrayList<String>();
		ArrayList list2	= new ArrayList();
		
		student s1=new student();
		s1.roll=101;
		s1.name="raouya";
		
		list1.add("john");
		list1.add("jenifer");
		list1.add("kate");
		list1.add("deep");
		list1.add("john");
		list2.add(10);
		list2.add(s1);
		System.out.println("list1 is:" +list1);
		System.out.println("list2 is:" +list2);
		String name=list1.get(2);
		System.out.println("name is :"+name);
		Object o =list2.get(1);
		System.out.println("name is :"+o);
		list1.set(2, "Fionna");
		System.out.println("hh:"+list1);
		list1.remove(2);
		System.out.println("hh:"+list1);
		if(list1.contains("raouya")) {
			System.out.println("raouya exist");
		}else {
			System.out.println("raouya not exist");
		}
		for(String  str : list1 ) {
			System.out.println(str);
		}
		for(int i=0;i<list1.size();i++) {
			System.out.println( "mod"+list1.get(i));
		}
		Iterator<String> itr = list1.iterator();
		System.out.println(itr.next());
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			if(str.equals("jenifer")) {
				itr.remove();
			}
		}
		System.out.println("list after"+list1);
	}
}
