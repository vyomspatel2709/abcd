
public class Ascci {

	public static void main(String[] args) {
		int i,j,k;
		for(i=65;i<75;i++)
		{
			for(k=1;k<75-i;k++)
			{
				System.out.print(" ");
			}
			for(j=65;j<=i;j++)
			{
				System.out.print(" "+(char)j);
			}
			System.out.println();
		}
	}
}
