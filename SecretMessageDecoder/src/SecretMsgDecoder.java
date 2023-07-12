import java.util.*;
public class SecretMsgDecoder {
    public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	char c = sc.next().charAt(0);
    	System.out.println(findSecretMsg.msgDecode(c));
    	sc.close();
    }
}
