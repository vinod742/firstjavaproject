package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset 
{

	public static void main(String[] args) 
	{
		//creating Hashset object
		
				TreeSet<String> ts = new TreeSet<String>();
				
				//adding values/elements to the object
				
				
				ts.add("gorige");
				ts.add("vinod");
				ts.add("kumar");               //it prints in ascending order
				ts.add("chinnu");
				ts.add("vinod");
				
				//reading/printing the object values
				
				Iterator itr = ts.iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
	}

}
