import java.util.Scanner;
public class gongyun{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first mumber ");
		int num1 = input.nextInt();
		System.out.print("Enter second mumber ");
		int num2 = input.nextInt();
		int gcd = 0;
		int i;
		for(i=2;i<=num1&&i<=num2;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				gcd = i;
			}
		}
		System.out.print("最大公约数" + num1 + "and" + num2 + "is" + gcd);	
	}
}
			
		