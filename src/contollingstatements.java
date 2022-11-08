import java.util.Scanner;

public class contollingstatements {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter marks of a student");
		int marks=input.nextInt();
		
	
		
		if(marks==100)
		{
			System.out.println("Topper in the batch");
		}
		
		else if (marks<=90&&marks>80)
		{
			System.out.println("first class");
		}
		else if (marks<=80&&marks>70)
		{
			System.out.println("second class");
		}
		else if (marks<=70&&marks>60)
		{
			System.out.println("third class");
		}
		else if (marks<=60&&marks>50)
		{
			System.out.println("just pass");
		}
		
		else
		
		{
			System.out.println("fail");
		
		}

	}

}
