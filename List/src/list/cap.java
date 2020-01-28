package list;

import java.util.ArrayList;

public class cap {
	
	public static void main(String[] args) 
    {
        ArrayList<String> l = new ArrayList<>(2);
         
        l.add("A");
        l.add("B");
         
        System.out.println(l);
         
        l.ensureCapacity(2);
         
        l.add("C");
        l.add("D");
        l.add("E");
 
        System.out.println(l);
    }
}

