import java.util.Scanner;
public class age{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a mumber for age");
		int age = input.nextInt();
		if(age>0&&age<=18)
		{
			System.out.println("少年");
		}
		if(age>18&&age<=28)
		{
			System.out.println("青年");
		}
		
		if(age>28&&age<=55)
		{
		    System.out.println("中年");
		}
		if(age>55)
		{
			System.out.println("老年");
		}
	}
}