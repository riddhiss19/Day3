import java.util.Scanner;
class Star_pat 
{
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int i,j,k,n;
			n=s.nextInt();

			for (i=1;i<=n;i++) 
			{
				for (j=1;j<i;j++) 
				 	{
						System.out.print(" ");
					}	
				for (k=1;k<=n;k++) 
				 	{
						System.out.print("*");
					}	

					System.out.print("\n");
			}

		}	
}