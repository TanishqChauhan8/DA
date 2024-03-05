import java.util.*;

class ABC{

	static int check(int key,int s[],int n)
	{
		for(int i=0;i<n;i++)
		{
			if(s[i]==key)
			return 1;
		}
		return 0;
	} 
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number of Nodes : ");
	int n=sc.nextInt();
	int c[][]=new int[n][n];
	
	for(int i=0;i<n;i++)
	{
		System.out.print("Enter the no of visited nodes : ");
		int n1=sc.nextInt();
		while(n1!=0)
		{
			System.out.print("Enter the pos of connected Node : ");
			int j=sc.nextInt();
			c[i][j]=1;
			n1--;
		}
	}
	int q[]=new int[n];
	int  v[]=new int[n];
	int a[]=new int[n];
	int p=1,r=1,fr=0;
	System.out.print("Enter the Source Node : ");
	int s1=sc.nextInt();
	q[0]=s1;
	v[0]=s1;
	int i=s1;
	fr=0;
	while(true)
	{
		i=q[fr];
		for(int j=0;j<n;j++)
		{
			if(c[i][j] == 1 && check(j,q,n)!=1)
			{
				q[r++]=j;
				v[p++]=j;
			}
		}
		fr++;
		if(fr==r)
		break;
	}
	
	
	for(int i1=0;i1<n;i1++)
	System.out.print(v[i1]+" ");
}
}