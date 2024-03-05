import java.util.*;

class ABC
{
	public static void main(String args[])
	{
		String s="TANISHQ";
		//String a[]=s.split("");
		Vector <String> v=new Vector<>();
		Collections.addAll(v,s.split(""));
		for(int i=0;i<v.size();i++)
		System.out.print(v.get(i)+" ");
	}
}