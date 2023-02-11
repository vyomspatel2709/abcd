import java.util.Scanner;

public class Whileloop {

	  public static void main(String[] args) {
		
		  int n,i;
		  Scanner sc=new Scanner(System.in);
		  for(i=0;i<5;i++)
		  {
			  int sum=0;
		  System.out.print("Enter N:");
		  n=sc.nextInt();
		  do
		  {
			  sum=sum+n;
			  n--;
		  }
		  while(n>0);
		  System.out.println("Sum :"+sum);
		  }
	}
}
