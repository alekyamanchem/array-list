package list;
import java.util.ArrayList;
import java.util.Arrays;
public class Rem {
	
	public static void main(String args[])
	{
		       ArrayList l1 = new ArrayList(Arrays.asList( "alekya", "durga", "srishty") );
		         
		        System.out.println(l1);  //list size is 3
		         
		        //Add element at 1 index
		        l1.remove(1);
		         
		        System.out.println(l1);  //list size is 2
		    }
		}
