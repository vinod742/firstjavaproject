import java.util.Scanner;

public class Swappingnumbers 
{

	public static void main(String[] args)
	{
		int x,y,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x and y");
		
		x= sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("before swapping numbers:" +x+" "+y);
		t=x;
		x=y;
		y=t;
		System.out.println("after swapping:" +x+" "+y);
		System.out.println();
	}

}
