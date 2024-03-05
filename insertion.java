import java.util.*;

class ABC
{
	public static void main(String ar[])
	{
		int n,min,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of the Array : ");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element into the array: ");
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
		  min=a[i];
		  
		for(j=i-1;j>=0 && min<a[j];j--)
		{
			a[j+1]=a[j];
		}
			a[j+1]=min;
		}
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]);
	}
}