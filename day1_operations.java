import java.util.Scanner;
public class day1_operations
{
	public static void main(String[] args)
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a number:");	
		int n1= a.nextInt();
		System.out.println("Enter a number:");
		int n2= a.nextInt();
		System.out.println("Sum:"+(n1+n2)+"\nDifference:"+(n1-n2)+"\nProduct:"+(n1*n2));
	}
}
