package list;

import java.util.ArrayList;
import java.util.Arrays;

public class get {
	public static void main(String[] args) 
    {
        ArrayList<String> l = new ArrayList<>(Arrays.asList("aley", "banuu", "carol", "dharma"));         
        String n1 = l.get(3);         
        String n2 = l.get(1);        
         
        System.out.println(n1);
        System.out.println(n2);
    }
}
