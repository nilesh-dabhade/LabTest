import java.util.*;
class Prog5
{
	public static void main(String args[])
	{
		
		Scanner sc =new Scanner(System.in);
		int a[] = new int[5]; 
		System.out.println("original Array: ");		
		
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
			//System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse Array is: ");
		
		for(int i=4;i>=0;i--)
		{
				System.out.print(a[i]+" ");
		}
		
	}
}	