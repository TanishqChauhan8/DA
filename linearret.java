import java.util.*;

class ABC
{
	public static int linear(int i,int n,int ar[],int v)
	{
		if(i<n)
		{
			if(ar[i]==v)
				return 1;
			else 
				return linear(i+1,n,ar,v);
		}
		return 0;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i=0,v;
		System.out.print("Enter the Size of the Array : ");
		n=sc.nextInt();
		int ar[]=new int[n];
		for(int k=0;k<n;k++)
		{
			System.out .println("Enter the Element into the Array : ");	
			ar[k]=sc.nextInt();
		}
		System.out.print("Enter the Element to search : ");
		v=sc.nextInt();
		if(linear(i,n,ar,v)==1)
			System.out.print("Key found");
		else
			System.out.print("Key Not found");
	}
}