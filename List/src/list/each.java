package list;

import java.util.ArrayList;

public class each {
	public static void main(String args[])
	{
		ArrayList<String> l1 = new ArrayList<>();
		 
		l1.add("Aley");
		l1.add("Banu");
		l1.add("Carol");
		l1.add("David");
		 
		l1.iterator().forEachRemaining( System.out::println );
	}

}
