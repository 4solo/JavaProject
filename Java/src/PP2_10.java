import java.util.Scanner;
public class PP2_10 {

	public static void main(String[] args) {
		//an application that determines the value of the coins in a jar.
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the quarters");
		int quarter=scan.nextInt();
		System.out.println("please enter the dimes");
		int dime=scan.nextInt();
		System.out.println("please enter the nickels");
		int nickel=scan.nextInt();
		System.out.println("please enter the pennies");
		int penny=scan.nextInt();
		int sum=quarter*25+dime*10+nickel*5+penny;
		int dollar=sum/100;
		int cent=sum%100;
		System.out.println(dollar+" dollars "+cent+" cents");
		
	}

}
