import java.util.Scanner;
public class day1_averagemarks
{
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your mark:");
		float m1=a.nextFloat();
		System.out.println("Enter your mark:");
		float m2=a.nextFloat();
		System.out.println("Enter your mark:");
		float m3=a.nextFloat();
		System.out.println("Total Marks:"+(m1+m2+m3)+"\nAverage:"+((m1+m2+m3)/3));
	}
}