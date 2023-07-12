import java.util.Scanner;

public class JourneyCalc {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	double speed = sc.nextDouble();
    	double time = sc.nextDouble();
    	CalculateJourney cj = new CalculateJourney();
    	System.out.printf("%.2f",cj.calcJourney(speed,time));
    }
}
