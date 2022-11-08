package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist 
{
     
	//creating linkedlist object
	public static void main(String[] args) 
	{
		LinkedList<String> x = new LinkedList<String>();
		
		x.add("gorige");
		x.add("vinod");
		x.add("kumar");
		x.add("yadav");
		x.add("vinod");
		
		//converting list to array
		
		String array[] = x.toArray(new String[x.size()]);
		//printing an array
		
		System.out.println("Print Array:" +Arrays.toString(array));
		
		Iterator itr = x.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
