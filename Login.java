import java.util.*;

public class Login
{

	public static void main(String []args)
	{
		String username;
		String password;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter your username:");
		username = scan.next();
		System.out.println("Debug-username:" + username);


		System.out.println("Please Enter your password:");
		password = scan.next();
		System.out.println("Debug-password:" + password);

	}
}