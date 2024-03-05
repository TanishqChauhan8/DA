import java.util.*;

class ABC{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];
		System.out.println("Enter 1 for linkage and 0 for not linkage");
		
		for(int i=0;i<5;i++)
		{
			System.out.printf("Enter the Number of linking Nodes for %d: ",i);
			int n=sc.nextInt();
			while(n!=0)
			{
				System.out.print("Enter the Linked node : ");
				int j=sc.nextInt();
				a[i][j]=1;
				n--;
			}
			
		}
		
		Stack<Integer>s=new Stack<>();
		Stack<Integer>d=new Stack<>();
		
		int v[]=new int[5];
		
		s.push(0);
		d.push(0);
		
		for(int i=s.peek();i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(a[i][j]==1)
				{
				
					if(s.contains(j) && j==4)
						s.pop();
				
					else if(s.contains(j))
					continue;
					
					else
					{
					s.push(j);
					d.push(j);
					v[j]=1;
					break;
					}
				}
			}
			
		}
		System.out.print(d);
		
	}
}