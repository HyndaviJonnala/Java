import java.util.*;
public class NumberRevereseApp {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	NumberReverse s = new NumberReverse();
    	int out = s.revNum(n);
    	System.out.println(out);
    	sc.close();
    }
}
