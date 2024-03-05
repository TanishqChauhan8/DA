import java.util.*;

class ABC
{
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		System.out.println();
	}
	
	static int[] radix(int a[],int c)
	{
		int r[]=new int[a.length];
		int d=0;
		
		while(d<c)
		{
			int count=0;
			int b[]=new int[10];
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(i==digit(a[j],d))
						count++;
				}
				b[i]=count;
				count=0;
			}
			System.out.print("Ist time b[] - ");
			display(b);
			
			for(int i=1;i<10;i++)
				b[i]=b[i]+b[i-1];
			System.out.print("2nd time b[] - ");
			display(b);
			
			for(int i=a.length-1;i>=0;i--)
			{
				int k=digit(a[i],d);
				b[k]=b[k]-1;
				System.out.print(b[k]+" ");
				r[b[k]]=a[i];
			}
			System.out.println();	
			System.out.print("3rd time b[] - ");
			display(b);
			System.out.print("Final array [] - ");
			display(r);
			d++;
		}
		return r;
	}
	
	static int digit(int n,int i)
	{
		/*n=n/Math.pow(10,i);
		return n%10;
		*/
		
		int d=1;
		while(i!=0)
		{
		d*=10;
		i--;
		}
		
		n=n/d;
		return n%10;
	}
	
	public static void main(String ar[])
	{
		int a[]={1,412,39,38,31,540};
		Scanner sc=new Scanner (System.in);
		int ans=0,c=0;
		
		for(int i=0;i<a.length;i++)
			ans=Math.max(a[i],ans);
	
		
		c=String.valueOf(ans).length();
		
		int result[]=radix(a,c);
		
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");
	}
}