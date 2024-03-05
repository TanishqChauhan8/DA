import java.util.*;

class ABC
{
	int c=1,m,j=0;
	int min(int g[][],int s,int v[])
	{
		int minInd=0;
		for(int i=0;i<g.length;i++)
		{
			if(g[minInd][i]<g[s][i] && v[i]!=1)
				minInd=i;
		}
		return minInd;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the no of nodes in the Graph : ");
		int n=sc.nextInt();
		int g[][]=new int [n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("Enter the weight at g["+i+"]["+j+"] : ");
				g[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter the Source : ");
		int s=sc.nextInt();
		int v[]=new int [n];
		
		ABC ob=new ABC();
		System.out.print(ob.min(g,s,v));
	}
}