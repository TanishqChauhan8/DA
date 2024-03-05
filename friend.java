import java.util.*;

class ABC{

	public static void main(String args[])
	{
		System.out.print("Enter the two Numbers : ");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=0,sum1=0;
		for(int i=1;i<=n1/2;i++)
		{
			if(n1%i==0)
			sum+=i;
		}
		
		for(int i=1;i<=n2/2;i++)
		{
			if(n2%i==0)
			sum1+=i;
		}
		
		if(sum==n1 && sum1==n2)
		System.out.print("Its a frindly pair");
	
		else
		System.out.print("Its Not a friendly pair");
	}
}