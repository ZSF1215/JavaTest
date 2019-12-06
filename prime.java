import java.util.Scanner;
public class prime{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number ");
		
		int num = input.nextInt();
		int flag =0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag =1;
				break;
			}
		}
		if(flag==0)
		{
		  System.out.print("是素数 ");
		}
		else
		{
			System.out.print("不是素数 ");
		}
	}
}
		