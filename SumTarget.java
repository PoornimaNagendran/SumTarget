import java.util.Scanner;
public class SumTarget {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int t=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==t)
				{
					System.out.println("The numbers are");
					System.out.println(a[i]);
					System.out.println(a[j]);
					break;
				}
			}
		}

	}

}
