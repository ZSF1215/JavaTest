public class zhi{
	public static void main(String[] args){
		double i=1.0;
	    double j=1.0;
		double sum=0.0;
	      
		for(i=1;i<=100;i++)
		{
		   if(i%2==0)
		   {
			   sum = sum+(-(j/i));
		   }
		   else
		   {
			   sum = sum+(j/i);
		   }
		   
		}
		System.out.print(sum);
	}
}