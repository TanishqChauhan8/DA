import java.util.*;
class Pair{
	int distance;
	int node;
	
	Pair(int node,int distance )
	{
		this.distance=distance;
		this.node=node;
	}
}
	
class ABC{
	static int[] dijkstra(ArrayList<ArrayList<ArrayList<Integer>>>adj,int s,int v)
	{
		PriorityQueue<Pair>pq=new PriorityQueue<>((x,y)-> x.distance-y.distance);
		int dis[]=new int[v];
		for(int i=0;i<v;i++)
		dis[i]=Integer.MAX_VALUE;
		
		dis[s]=0;
		pq.add(new Pair(s,0));
		
		while(!pq.isEmpty())
		{
			int d=pq.peek().distance;
			int node=pq.peek().node;
			pq.remove();
			
			for(int i=0;i<adj.get(node).size();i++)
			{
				int edgeweight=adj.get(node).get(i).get(1);
				int nextnode=adj.get(node).get(i).get(0);
				if(d+edgeweight<dis[nextnode])
				{
					dis[nextnode]=d+edgeweight;
					pq.add(new Pair(dis[nextnode],node));
				}
			}
		}
		return dis;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<ArrayList<Integer>>>adj=new ArrayList<>();
		
		for(int i=0;i<7;i++)
		{
			adj.add(new ArrayList<>());
			System.out.println("Enter the Number of Connected Nodes : ");
			int n=sc.nextInt();
			while(n-->0)
			{
				System.out.println("Enter the connectd node and weight : ");
				int c=sc.nextInt();
				int w=sc.nextInt();
				adj.get(i).add(new ArrayList<>(Arrays.asList(c,w)));
			}
		}
		
		System.out.println(Arrays.toString(dijkstra(adj,0,7)));
	}
}
				