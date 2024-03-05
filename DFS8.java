import java.util.*;

class ABC{
	int k=0;
	void DFS(int a[][],int v[],int s,int n)
	{
		v[k++]=s;
		System.out.print(s);
		for(int j=0;j<n;j++)
		{
			if(a[s][j]==1 && v[j]!=s){
			DFS(a,v,j,n);
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of the array : ");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the no of connected nodes : ");
			int n1=sc.nextInt();
			while(n1!=0)
			{
				System.out.print("Enter the pos of the connected Node : ");
				int j=sc.nextInt();
				a[i][j]=1;
				n1--;
			}
		}
		int v[]=new int [n];
		System.out.print("Enter the Source Node : ");
		int s=sc.nextInt();
		ABC ob=new ABC();
		ob.DFS(a,v,s,n);
	}
}
			