import java.util.*;

class pair
{
	int distance,node;
	pair(int node,int distance)
	{
		this.distance=distance;
		this.node=node;
	}
}

class ABC{
	
	static int [] prims(ArrayList<ArarayList<ArrayList<Integer>>>adj,int s,int n)
	{
		PriorityQueue<pair>pq=new PriorityQueue((a,b) -> a.distance - b.distance);
		
		int vis[]=new int [n];
		int sum=0;
		
		int parent[]=new int [n];
		parent[s]=-1;
		
		pq.add(new pair(s,0));
		
		while(!pq.isEmpty())
		{
			int node=pq.peek().node;
			int distance=pq.peek().distance;
			pq.poll();
			if(vis[node]==1)continue;
			
			vis[node]=1;
			sum+=distance;
			
			for(ArrayList<Integer>it:adj.get(node))
			{
			
				int nextnode=it.get(0);
				int weight=it.get(1);
				if(vis[nextnode]==0)
				{
					pq.add(new pair(nextnode,weight));
					parent[nextnode]=node;
				}
			}
		}
		return sum;
	}
	
	static void printPath(int[] parent, int j) {
			if (parent[j] == -1)
				return;

			printPath(parent, parent[j]);

			System.out.print(j + " ");
		}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<ArarayList<ArrayList<Integer>>>adj=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			adj.add(new ArrayList<>());
			System.out.println("Enter the Number of Connected Node : ");
			int m=sc.nextInt();
			while(m-->0)
			{
				System.out.println("Enter the Connected Node and weight to the Connected Node : ");
				int c=sc.nextInt();
				int w=sc.nextInt();
			
				adj.get(i).add(new ArrayList<>(Arrays.asList(c,w)));
				
			}
		}
		
		int distance[]=prims(adj,0,5);
		
		System.out.print("Shortest path from 0 to " + 5 + ": ");
				printPath(parent, 5);
				System.out.println();
			
	}
}
