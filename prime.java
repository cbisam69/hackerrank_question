import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int count=0;
		System.out.println("ENTER THE  NUMBER");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{
		    if(x%i==0)
		    {
		        count++;
		    }
		}
		if(count==2)
		{
		  	System.out.println("the given number is prime");  
		}
		else
			System.out.println("not a prime");
		
	}
}
