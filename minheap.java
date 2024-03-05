import java.util.*;

class ABC
{
	public static void main(String args[])
	{
		int a[]={1,3,8,2,9,10,7};
		PriorityQueue<Integer>p=new PriorityQueue<>();
		
		for(int i=0;i<a.length;i++)
		p.add(a[i]);
		
		while(!p.isEmpty())
		{
			System.out.print(p.peek()+" ");
			p.poll();
		}
	}
}
	