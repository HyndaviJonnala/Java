import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	double fahrenheit = sc.nextDouble();
    	ConvertTemperature ct = new ConvertTemperature();
    	System.out.printf("%.2f",ct.convTemp(fahrenheit));
    	
    }
}
