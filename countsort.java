import java.util.*;

class ABC
{
	
	static int[] countsort(int ar[],int n)
	{
		int count=0,m=0;
		for(int i=0;i<n;i++)
		{
			m=Math.max(m,ar[i]);
		}
		m++;
		
		int b[]=new int[m];
		int l=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==ar[j])
				 count++;
			}
			b[i]=count;
			count=0;
		}
	
		for(int i=1;i<m;i++)
		{
			b[i]=b[i]+b[i-1];
		}
		
		int c[]=new int[m];
		
		for(int i=0;i<n;i++)
		{
			int k=ar[i];
			b[k]=b[k]-1;
			c[b[k]]=ar[i];
		}
	
		return c;
	}
			
					
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		n=sc.nextInt();
		
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the Element into the Array : ");
			ar[i]=sc.nextInt();
		}
		int result[]=countsort(ar,n);
		for(int i=0;i<n;i++)
		System.out.print(result[i]+" ");
	}
}