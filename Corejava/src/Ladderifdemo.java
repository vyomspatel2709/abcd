import java.util.Scanner;

public class Ladderifdemo {

	 public static void main(String[] args) {
		String sname;
		int rno,s1,s2,s3,total;
		double per;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name of student :");
		sname=sc.next();
		System.out.println("Enter roll no.");
		rno=sc.nextInt();
		System.out.print("Enter Marks of Subject1 :");
		s1=sc.nextInt();
		System.out.print("Enter Marks of Subject2 :");
		s2=sc.nextInt();
        System.out.print("Enter Marks of Subject3 :");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("Student Name :"+sname);
		System.out.println("Total :"+total);
		System.out.println("Percentage :"+per);
		
		if(per>=70)
		{
			System.out.println("Distinction");
		}
		else if(per>=60)
		{
            System.out.println("First Class");			
		}
		else if(per>=50)
		{
			System.out.println("Second Class");
		}
		else if(per>=40)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Fail");
		}
	
	}
}
