import java.util.*;

class ABC
{
	static void heapify(int a[],int i)
	{
		if(i<3)
		{
			int root=i;
			int left=i*2+1;
			int right=i*2+2;
			
			if(a[root]<a[right])
				root=right;
			
			if(a[root]<a[left])
				root=left;
			
			if(root!=i)
			{
				int temp=a[i];
				a[i]=a[root];
				a[root]=temp;
			}
			heapify(a,i+1);
		}
		
		else
		{
			if(check(a)!=1)
			{
				heapify(a,0);
			}
		}
	}
	
	static int check(int a[])
	{
		int k=1;
		for(int i=0;i<3;i++)
		{
			if(!(a[i]>a[i*2+1] && a[i]>a[i*2+2]))
			{	
				k=0;
				break;
			}
		}
		return k;
	}
			
	public static void main(String ar[])
	{
		int a[]={18,26,33,9,1,66,5};
		heapify(a,0);
		
		for(int i=0;i<a.length;i++)
		 System.out.print(a[i]+" ");
	} 
}
