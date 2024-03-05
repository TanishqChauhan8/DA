import java.util.*;

class ABC
{
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of the Array : ");
		int n=sc.nextInt();
		int b[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the Element into the Array: ");
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		{
			if(b[i]>b[i+1])
			{
				int temp=b[i];
				b[i]=b[i+1];
				b[i+1]=temp;
				
				i=-1;
			}
		}
		
		for(int i=0;i<n;i++)
		System.out.print(b[i]+" ");
	}
}
			