import java.util.*;

class ABC{

	static int knapseck(int w,int n,int []profit,int weight[])
	{
		int dp[]=new int[w+1];
		for(int i=1;i<=n ;i++)
		{
			for(int W=w;W>=0;W--)
			{
				if(	weight[i-1]<=W)
				dp[W]=Math.max(dp[W],dp[W-weight[i-1]]+profit[i-1]);
			}
		}
		return dp[w];
	}		
					

	
	public static void main(String args[])
	{
		
        int profit[] = { 60, 100, 120 }; 
        int weight[] = { 10, 20, 30 };   
        int w = 50;            
		int n=profit.length;
		System.out.println(knapseck(w,n,profit,weight));
	}
}
