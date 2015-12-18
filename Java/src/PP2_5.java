import java.util.Scanner;
public class PP2_5 {

	public static void main(String[] args) {
		//Create a version of the TempConverter application to convert from Fahrenheit to Celsius. 
		//read the Fahernheit temperature from the user.
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Fahrenheit ");
		float temp=scan.nextFloat();
		System.out.println("the Celsius is "+ (temp-32)/1.8);
	}

}
