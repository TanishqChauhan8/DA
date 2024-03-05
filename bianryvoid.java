import java.util.*;

class ABC
{
	static int k=0;
	public static void binary(int low,int high,int key,int a[])
	{
		if(low<=high)
		{
			int mid=(low+high)/2;
			
			if(key==a[mid])
			{
				System.out.print("Key found");
				k=1;
			}
			else if(key<a[mid])
				binary(low,mid-1,key,a);
			else if(key>a[mid])
				binary(mid+1,high,key,a);
		}
	}
	
	public static void main(String ar[])
	{
		int a[]={1,4,2,3};
		int low=0,high=3,key=8;
		binary(low,high,key,a);
		
		if(k!=1)
		System.out.print("Key not Found");
	}
}
