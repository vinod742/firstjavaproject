package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_linkedHashSet
{

	public static void main(String[] args) 
	{
	//creating Hashset object
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		//adding values/elements to the object
		
		
		lhs.add("gorige");
		lhs.add("vinod");
		lhs.add("kumar");                                     //it prints in order which we given
		lhs.add("chinnu");
		lhs.add("vinod");
		
		//reading/printing the object values
		
		Iterator itr = lhs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
