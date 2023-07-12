import java.util.Scanner;

public class FinanceCalculatorApp {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	double p = sc.nextDouble();
    	double r = sc.nextDouble();
    	double t = sc.nextDouble();
    	System.out.printf("%.2f",FinanceCalculator.calculateSimpleInterest(p,r,t));
    	sc.close();
    }
}
