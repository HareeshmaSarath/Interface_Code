package interfacecode;
import java.util.*;
public class I_HDFC implements I_RBI{

	public void recurringDeposit(int amt, double duration) 
	{
		double inter_n=(amt*interestrate*duration)/100;
		System.out.println("Interest Amount get in the given duration("+duration+")is: "+inter_n);
		System.out.println("Deposit Amount: "+amt);
		System.out.println("Duration of deposit: "+duration);
		System.out.println("Rate of Interest: "+interestrate);
		System.out.println("Amount you get after "+duration+" year is: "+(amt+inter_n));
	}
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the deposit amount:");
		int deposit=sc.nextInt();
		System.out.println("Enter the duration(In Year):");
		double duration=sc.nextDouble();
		I_RBI ob=new I_HDFC();
		ob.recurringDeposit(deposit, duration);
	}
}