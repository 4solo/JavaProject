import java.util.Scanner;
public class PP2_9 {

	public static void main(String[] args) {
		//reverse version of PP2.8 
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the seconds");
		int second=scan.nextInt();
		int hour=0;
		int minute=0;
		hour=second/3600;
		minute=second%3600;
		second=minute%60;
		minute=minute/60;
		System.out.println(hour+" hour "+minute+" mintues "+second+" seconds ");
	}

}
