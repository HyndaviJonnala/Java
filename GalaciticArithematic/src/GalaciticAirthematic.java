import java.util.*;
public class GalaciticAirthematic {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	long num1 = sc.nextLong();
    	long num2 = sc.nextLong();
    	long res = galaciticAddition(num1,num2);
    	System.out.println(res);
    }

public static long galaciticAddition(long num1,long num2)
{
	return num1+num2;
}
}