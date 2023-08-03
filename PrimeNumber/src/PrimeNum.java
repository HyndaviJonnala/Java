import java.util.*;
public class PrimeNum {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	int n= sc.nextInt();
    	for(int i=2;i<n;i++)
    	{
    		if(n%i==0)
    		{
    			System.out.println(n+" is not a prime number");
    			return;
    		}
    		else
    		{
    			System.out.println(n+" is a prime number");
    			return;
    		}
    	}
    	sc.close();
    }
}
