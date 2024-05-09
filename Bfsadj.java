import java.util.*;

class ABC{

	static void bfsgraph(ArrayList<ArrayList<Integer>>adj,int n)
	{
		ArrayList<Integer>bfs=new ArrayList<>();
		int vis[]=new int[n+1];
		Queue<Integer>Q=new LinkedList<>();
		bfs.add(1);
		Q.add(1);
		vis[1]=1;
		while(!Q.isEmpty())
		{
			int i=Q.poll();
			for(int j:adj.get(i))
			{
				if(vis[j]!=1)
				{
					bfs.add(j);
					Q.add(j);
					vis[j]=1;
				}
			}
		}

		System.out.println(bfs);
		
	}
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int i,int j)
	{
		adj.get(i).add(j);
		adj.get(j).add(i);
	}
	
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
		
		for(int i=0;i<7;i++)
		adj.add(new ArrayList<Integer>());
	
		
		addEdge(adj,1,2);
		addEdge(adj,1,3);
		addEdge(adj,2,4);
		addEdge(adj,2,6);
		addEdge(adj,4,5);
		bfsgraph(adj,6);
	}
}

