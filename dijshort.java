import java.util.*;

class pair
{
int node,distance;
	pair(int node,int distance)
	{
		this.node=node;
		this.distance=distance;
	}
}

class ABC{

	static int[] dij(ArrayList<ArrayList<ArrayList<Integer>>>adj,int s,int n)
	{
		PriorityQueue<pair>pq=new PriorityQueue<>((a,b)-> a.distance - b.distance);

		pq.add(new pair(s,0));
		int dis[]=new int[n];
		
		int parent[]=new int[n];
		for(int i=0;i<n;i++)
		{
		dis[i]=Integer.MAX_VALUE;
		parent[i]=i;
		}
		dis[s]=0;
		
		while(!pq.isEmpty())
		{
			int node=pq.peek().node;
			int weight=pq.peek().distance;
			pq.poll();
			
			for(int i=0;i<adj.get(node).size();i++)
			{
				int c=adj.get(node).get(i).get(0);
				int w=adj.get(node).get(i).get(1);
				if(weight+w<dis[c])
				{
					int sum=weight+w;
					dis[c]=sum;
					parent[c]=node;
				}
			}
		}
		
		return parent;
	}
		
		
	
	public static void main(String args[])
	{
		ArrayList<ArrayList<ArrayList<Integer>>>adj=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the Number of connectedd Node : ");
			int n=sc.nextInt();
			adj.add(new ArrayList<>());
			while(n-->0)
			{
				System.out.println("Enter the Connected Node : ");
				int node=sc.nextInt();
				System.out.println("Enter the Weight of Connected Node : ");
				int w=sc.nextInt();
				adj.get(i).add(new ArrayList<>(Arrays.asList(node,w)));
			}
			
		}
		
		System.out.println(Arrays.asList(dij(adj,0,4)));
	}
}
		