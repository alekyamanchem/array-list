package list;

import java.util.ArrayList;
import java.util.Iterator;

public class iter {
	public static void main(String args[])
	{
		ArrayList<String> l = new ArrayList();
	    
		l.add("Ayush");
		l.add("tara");
		l.add("Caveri");
		l.add("gary");		 
		
	Iterator<String> i = l.iterator();
	
		while(i.hasNext()) {
	    System.out.println( i.next() );
	}
}
}
