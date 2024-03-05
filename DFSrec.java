import java.util.*;

class ABC 
{
	int k = 1,l = 1,i = 0;
    static int check(int key, int s[],int n1) 
	{
        for(int i = 0; i < n1; i++) 
		{
            if(s[i] == key)
                return 1;
        }
        return 0;
    }
	
	void DFS(int s[],int d[],int a[][],int n1)
	{
		if(k!=0)
		{
			i = s[k - 1];
			int count = 0; 

			for (int j = 0; j < n1; j++) 
			{
				if (a[i][j] == 1 && check(j,d,n1) != 1) 
				{
					s[k++] = j;
					d[l++] = j;
					count = 1;
				}
			}
			
			if (count == 0) 
				k--; 
				
			DFS(s,d,a,n1);
		}
		else
		{
			System.o ut.print("DFS Traversal: ");
			for (int j = 0; j < l; j++)
				System.out.print(d[j] + " ");
		}
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Nodes : ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the no of visited nodes for node " + i + " : ");
            int m = sc.nextInt();
            while (m != 0) {
                System.out.print("Enter the pos of connected Node : ");
                int j = sc.nextInt();
                a[i][j] = 1;
                m--;
            }
        }

        int s[] = new int[n];
        int d[] = new int[n];
        System.out.print("Enter the Source Node : ");
        int s1 = sc.nextInt();
        s[0] = s1;
        d[0] = s1;
		ABC ob=new ABC();
		ob.DFS( s,d,a,n);
	}
}
