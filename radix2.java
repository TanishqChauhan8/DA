import java.util.Scanner;

class ABC
{
	static int[] radix(int a[])
	{
		int count=0;
		int b[]=new int[10];
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==(a[j]%10))
				count++;
			}
			b[i]=count;
			count=0;
		}
		
		for(int i=1;i<10;i++) 
			b[i]=b[i]+b[i-1];
	
		int c[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			int k=a[i]%10;
			b[k]=b[k]-1;
			c[b[k]]=a[i];
		}
		return c;
	}
	
	
	public static void main(String ar[])
	{
		int a[]={626,412,38,291,836,540};
		int r[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		r[i]=a[i];
	
		int c=0;
		for(int i=0;i<3;i++)
		{
			int result[]=radix(a);
			
			for(int j=0;j<a.length;j++)
			a[j]=a[j]/10;
		
			c++;
			
			if(c==3)
			{
				for(int k=0;k<result.length;k++) 
				{
					for(int l=0;l<r.length;l++)
					{
						if(result[k]==(r[l]/100))
							System.out.print(r[l]+" ");
					}
				}
			}
		}
	}
}