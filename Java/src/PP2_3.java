import java.util.Scanner;
public class PP2_3 {

	public static void main(String[] args) {
		//Write an application that prompts for and reads a person's name, age,college, 
		//and pet's name,Then print the following paragraph inserting the appropriate data;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter name");
		String name=scan.nextLine();
		System.out.println("Please enter age");
		int age=scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter college");
		String college=scan.nextLine();
		System.out.println("Please enter pet's name");
		String pet_name=scan.nextLine();
		System.out.println("Hello, my name is "+name+" and I am "+age+" years");
		System.out.println("old. I'm enjoying my time at "+college+ ", though");
		System.out.println("I miss my pet "+ pet_name+" very much!");
	}

}
