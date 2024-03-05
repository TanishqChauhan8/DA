import java.util.*;

class ABC
{
	public static void linear(int i,int n,int ar[],int v)
	{
		if(i<n)
		{
			if(ar[i]==v)
			{
			System.out.println("Key found");
			return;
			}
			linear(i+1,n,ar,v);
		}
	
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i=0,v;
		System.out.print("Enter the Size of the Array : ");
		n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out .println("Enter the Element into the Array : ");	
			ar[i]=sc.nextInt();
		}
		System.out.print("Enter the Element to search : ");
		v=sc.nextInt();
		linear(i,n,ar,v);
	}
}