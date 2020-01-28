package list;

import java.util.ArrayList;

public class cln {

	    public static void main(String[] args) 
	    {
	        ArrayList<String> l1 = new ArrayList<>(); 
	         
	        l1.add("Alekya");
	        l1.add("Banuu");
	        l1.add("Car");
	        l1.add("Dog  ");
	         
	        System.out.println(l1);   
	         
	        ArrayList<String> arrayListClone =  (ArrayList<String>) l1.clone();
	         
	        System.out.println(arrayListClone);   
	    }
	}
