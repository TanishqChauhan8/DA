import java.util.*;
class ABC
{
	public static void main(String args[])
	{
		int ar[]={1,2,1,3,9,7,6,2,8,3};
		int n=0;
		for(int i=0;i<ar.length;i++)
			n=Math.max(ar[i],n);
		int b[]=new int[n+1];
		int count=0;
		for(int i=0;i< b.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(i==ar[j])
				 count++;
			}
			b[i]=count;
			count=0;
		}
	
		for(int i=1;i<b.length;i++)
			b[i]=b[i]+b[i-1];
		
		int k;
		int c[]=new int[n+1];
		for(int i=0;i<b.length;i++)
		{
			k=ar[i];
			b[k]=b[k]-1;
			c[b[k]]=ar[i];
		}
		
		for(int i=0;i<c.length;i++)
		System.out.println(c[i]);
	}
}	