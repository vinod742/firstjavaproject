package Collections;

import java.util.HashSet;

public class Set_HashSet
{

	public static void main(String[] args)
	{
		//creating Hashset object
		
		HashSet<String> hs = new HashSet<String>();
		
		//adding values/elements to the object
		
		
		hs.add("gorige");
		hs.add("vinod");
		hs.add("kumar");               //it doesn't print in order
		hs.add("chinnu");
		hs.add("vinod");
		
		//reading/printing the object values
		
		for(String s:  hs)
		{
			System.out.println("Elements of hashset are:" +s);
		}

	}

}
