package list;
import java.util.ArrayList;
public class arrlist {
	public static void main(String args[])
	{
		ArrayList l1 = new ArrayList<>();
		l1.add("sssss");
		l1.add("pujitha");
		l1.add("durga");
		l1.add("alekya");
		l1.add("manchem");
		ArrayList l2 = new ArrayList<>();
		l2.add("srishty");
		l1.addAll(l2);
		System.out.println(l1);
		
	}

}
