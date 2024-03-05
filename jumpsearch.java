import java.util.*;

class ABC
{
	static int linear(int s,int e,int a[])
	{
		int key,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Key  element to  search : ");
		key=sc.nextInt();
		for(int i=s;i<=e;i++)
		{
			count++;
			if(a[i]==key)
				return 1;
			
			if(count==a.length)
			{
				System.out.print("Key Not found");
				break;
			}
		}
		return 0;
	}
			
		
	public static void main(String  args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array : ");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Element into the Array : ");
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length-2;i++)
		{
			int s=i;
			int e=s+2;
			if(linear(s,e,a)==1)
			{
				System.out.println("key found");
				break;
			}
		}
	}
}