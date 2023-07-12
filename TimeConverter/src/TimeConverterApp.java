import java.util.*;
public class TimeConverterApp {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	int min = sc.nextInt();
    	System.out.println(TimeConverter.convertToHours(min));
    	sc.close();
    }
}
