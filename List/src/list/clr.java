package list;

import java.util.ArrayList;

public class clr {
	
	public static void main(String[] args) 
    {
        ArrayList<String> l1 = new ArrayList<>(); 
         
        l1.add("Aley");
        l1.add("Banuu");
        l1.add("Carol");
        l1.add("David");
         
        System.out.println(l1);   
         
       l1.clear();
         
        System.out.println(l1);   
    }
}

