
public class NumberReverse {
    int revNum(int n)
    {
    	int r = 0;
    	while(n!=0)
    	{
    	
    	int lastDigit = n%10;
    	r=r*10+lastDigit;
    	n=n/10;
    	}
    	return r;
    }
}
