import java.util.Scanner;		
public class PP2_7 {

	public static void main(String[] args) {
		// read speed and distance
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the speed");
		int speed=scan.nextInt();
		System.out.println("Please enter the distance");
		int distance=scan.nextInt();
		System.out.println("the time we need is "+(float)distance/speed);

	}

}
