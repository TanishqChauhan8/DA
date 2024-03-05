import java.util.*;

class ABC
{
	public static void bubble(int i,int n,int ar[])
	{
		if(i<n)
		{
			for(int j=0;j<n;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			bubble(i+1,n,ar);
		}
	}
	
	public static void main(String args[])
	{
		int i=0,n,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		n=sc.nextInt();
		int ar[]=new int[n];
		for(int k=0;k<n;k++)
		{
			System.out.printf("Enter the element at a[%d] : ",i);
			ar[k]=sc.nextInt();
		}
		bubble(i,n,ar);
		
		for(int l=0;l<n;l++)
		System.out.print(ar[l]+" ");
	}
}