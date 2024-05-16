import java.util.*;

class ABC{

	addEdge(ArrayList<Integer>adj,int i)
	{
		System.out.println("Enter the connected Node : ");
		int k=sc.nextInt();
		
		adj.get(i).add(k);
	}
	
	
	public static void main(String rags[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Nodes : ");
		int n=sc.nextInt();
	
		ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
		
		for(int i=0;i<=3;i++)
		adj.get(i).add(new ArrayList<Integer>());
		
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter the Number of connected Nodes to "+i" : ");
			int j=sc.nextInt();
			
			while(j-- >0)
			addEdge(adj,i)
		}
	}