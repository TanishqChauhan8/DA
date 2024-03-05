import java.util.Scanner;

class ABC 
{
	 int k=1,p=1,q=0,i=0;
     
	 void bfs(int[][] M,int[] visited,int ans[], int s1) 
	 {
		if(p<M.length)
		{
			for (int j = 0; j < M.length; j++) 
			{
				if (M[s1][j] == 1 && visited[j]!=1)
				{
						visited[j]=1;
						ans[p++]=j;
				}
			}
			q++;
			bfs(M,visited,ans,ans[q]);
		}
	 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[][]M = new int[n][n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of connected nodes for vertex " + i + ": ");
            int num = sc.nextInt();
            while (num > 0) {
                System.out.print("Enter the position of the connected node: ");
                int j = sc.nextInt();
                M[i][j] = 1;
                num--;
            }
        }

        System.out.print("Enter the source node: ");
        int s1= sc.nextInt();
        int [] visited = new int [n];
		visited[0]=s1;
		visited[s1]=1;
        System.out.print("DFS traversal starting from the source node: ");
		ABC ob=new ABC();
		int ans[]=new int [n];
		ans[0]=s1;
		ob.bfs(M, visited,ans, s1);
		for(int i=0;i<n;i++)
		System.out.print(ans[i]+" ");
    }
}
