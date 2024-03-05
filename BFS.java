import java.util.*;

class ABC{

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number of Nodes : ");
	int n=sc.nextInt();
	int k=0;
	int c[][]=new int[n][n];
	
	for(char i='A' ;i<='I';i++)
	{
		for(char j='A';j<='I';j++)
			c[i][j]=sc.nextInt();
	}
	
	Queue <Character> s=new LinkedList<Character>();
	Queue <Character> v=new LinkedList<Character>();
	int a[]=new int[n];
	
	for(char i='A';i<='I';i++){
	for(char j='A';j<='I';j++){
	
	if(c[i][j] == 1){
	
			if(s.contains(j) && s.size()==n){
			while(s.isEmpty())
			s.remove();
			}
	
			else if(s.contains(j))
			continue;
	
			else{
			s.add(j);
			v.add(j);
			a[j]=1;
			}
		}
	}
	
	}
	
	System.out.print(v);
	
	for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
}
}