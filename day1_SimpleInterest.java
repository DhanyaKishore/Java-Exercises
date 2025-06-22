import java.util.Scanner;
public class day1_SimpleInterest
{
	public static void main(String[] args)
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter the principal:");	
		float p= a.nextFloat();
		System.out.println("Enter the rate of interest (in %):");
		float r= a.nextFloat();
		System.out.println("Enter the time (in years):");
		float t= a.nextFloat();
		float si=p*r*t;
		System.out.println("Simple Interest:"+si);
	}
}