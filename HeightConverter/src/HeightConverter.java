import java.util.Scanner;

public class HeightConverter {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	double inches = sc.nextDouble();
    	System.out.printf("%.2f",FeetConverter.conv(inches));
    	sc.close();
    }
}
