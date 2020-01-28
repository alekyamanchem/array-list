package list;

import java.util.ArrayList;
import java.util.Arrays;

public class index {
	public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("alex", "brian", "charles","alex","dough","gary","harry"));
         
        int firstIndex = list.lastIndexOf("alex");
         
        System.out.println(firstIndex);
         
        firstIndex = list.lastIndexOf("hello");
         
        System.out.println(firstIndex);
    }
}


