import java.util.Scanner;

class vs
{
	double width,height,depth;
	vs()
	{
		System.out.println("Default constructor called.");
		width=3;
		height=4;
		depth=5;
	}
	vs(double w,double h,double d)
	{
		System.out.println("Parameterized Constructor.");
		width=w;
		height=h;
		depth=d;
	}
	vs(vs v)
	{
		System.out.println("Copy constructor called");
		width=v.width;
		height=v.height;
		depth=v.depth;
	}
	void volume()
	{
		System.out.println("Volume "+(width*height*depth));
	}
}


public class Parameterized {

	public static void main(String[] args) {
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value 1:");
		i=sc.nextInt();
		System.out.print("Enter value 2:");
		j=sc.nextInt();
		System.out.print("Enter value 3:");
		k=sc.nextInt();
		
		vs b1=new vs();
		b1.volume();
		
		vs b2=new vs(i,j,k);
		b2.volume();
		
		vs v1=new vs(b2);
		v1.volume();
	}
}
