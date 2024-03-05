import java.util.*;

class ABC{
	
	int p=1,r=1,fr=0,i=0;
	
	static int check(int key,int s[],int n1)
	{
		for(int i=0;i<n1;i++)
		{
			if(s[i]==key)
			return 1;
		}
		return 0;
	} 
	
	 void bfs(int q1[],int v1[],int c1[][],int n){
		if(fr<r)
		{
			i=q1[fr];
			
			for(int j=0;j<n;j++)
			{
				if(c1[i][j]== 1 && check(j,q1,n)!=1)
				{
					q1[r++]=j;
					v1[p++]=j;
				}
			}
			
			fr++;
			bfs(q1,v1,c1,n);
		}
		
		else{
		for(int j=0;j<n;j++)
		System.out.print(v1[j]+" ");
		}
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
	
	int p=1,r=1,fr=0;
	System.out.print("Enter the Source Node : ");
	int s1=sc.nextInt();
	q[0]=s1;
	v[0]=s1;
	fr=0;
	ABC ob=new ABC();
	ob.bfs(q,v,c,n);
}
}