import java.util.Scanner;
public class PP2_2 {

	public static void main(String[] args) {
		// Write an application that reads three integers and prints their average;
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter how many intergers:");
		int size=scan.nextInt();
		int []Number=new int [size];
		for(int i=0;i<size;i++){
			Number[i]=scan.nextInt();
		}
		double sum=0;
		for(int i=0;i<size;i++){
			sum+=Number[i];
		}
		System.out.println("Average is "+sum/size);
	}
}
