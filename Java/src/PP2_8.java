import java.util.Scanner;
public class PP2_8 {

	public static void main(String[] args) {
		// convert hours and minutes and second into seconds
		//get a Scanner for system;
		Scanner scansystem=new Scanner (System.in);
		System.out.println("please enter the hours ");
		int hour=scansystem.nextInt();
		System.out.println("please enter the minutes");
		int minute=scansystem.nextInt();
		System.out.println("please enter the seconds");
		int second=scansystem.nextInt();
		System.out.println("total seconds is "+(hour*3600+minute*60+second));

	}

}
