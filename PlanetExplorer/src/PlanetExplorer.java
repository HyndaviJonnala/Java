import java.util.*;
public class PlanetExplorer {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	double radius = sc.nextDouble();
    	System.out.println(Explorer.calculateSurfaceArea(radius));
    			sc.close();
    }
}
