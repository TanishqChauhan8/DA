import java.util.*;

class ABC{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int count=0;
	System.out.print("Enter the Size of the Array : ");
	int  n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	System.out.print("Enter Element into the Array : ");
	a[i]=sc.nextInt();
	}
	
	Arrays.sort(a);
	for(int i=0;i<n-1;i++)
	{
		if(a[i]==a[i+1]){
		System.out.print("Yes");
		break;
		}
		count++;
	}
	if(count==n-1)
		System.out.print("No");
	
	}
	}