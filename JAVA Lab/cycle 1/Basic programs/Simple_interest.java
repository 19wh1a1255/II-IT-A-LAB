import java.util.Scanner;
public class SimpleInterest {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		double PAmount, ROI, TimePeriod, simpleInterset;
		sc = new Scanner(System.in);
		
		System.out.print("Enter the Principal Amount : ");
		PAmount = sc.nextDouble();
		
		System.out.print("Enter the Rate Of Interest : ");
		ROI = sc.nextDouble();
		
		System.out.print("Enter the Time Period in Years : ");
		TimePeriod = sc.nextDouble();
		
		simpleInterset = (PAmount * ROI * TimePeriod) / 100;
		
		System.out.println("\nThe Simple Interest for Principal Amount " + PAmount + " is = " + simpleInterset);
	}
}
