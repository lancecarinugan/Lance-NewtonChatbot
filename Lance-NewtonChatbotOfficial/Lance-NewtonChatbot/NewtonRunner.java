
/**
 * A class to run IssacNewton Class
 *
 * @author Lance Carinugan
 * @version September 2022
 */
import java.util.Scanner;

public class NewtonRunner
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		IsaacNewton newton = new IsaacNewton();
		
		System.out.println (newton.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (newton.getResponse(statement));
			statement = in.nextLine();
		}
	}

}