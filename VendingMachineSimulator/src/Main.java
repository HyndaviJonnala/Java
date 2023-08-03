import java.util.*;
public class Main {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	String productCode = sc.nextLine();
        getProduct(productCode);
        sc.close();
    }
    public static void getProduct(String productCode)
    {
    	switch(productCode)
    	{
    	case "P01":
    		System.out.println("Sprite");
    		break;
    	case "P02":
    		System.out.println("Coke");
    		break;
    	case "P03":
    		System.out.println("Maaza");
    		break;
    	case "P04":
    		System.out.println("7up");
    		break;
    		default:
    			System.out.println("Sorry Stock is not Available");
    	}
    }
}
