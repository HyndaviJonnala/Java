import java.util.*;
public class TheCube {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	int num=sc.nextInt();
    	System.out.println(CubeFinding.cubeFind(num));
    	sc.close();
    }
}
