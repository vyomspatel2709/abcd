package keyword;

import java.util.Scanner;
class x
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A:");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A:"+a);
	}
	
	x()
	{
		System.out.println("Default constructor called.");
	}
	void show()
	{
		System.out.println("Show from X");
	}
}
class y extends x
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter B:");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B:"+b);
	}
	
	y()
	{
		System.out.println("Default constructor called.");
	}
	void show()
	{
		super.show();
		System.out.println("Show from Y");
	}
}
class z extends y
{
	int c;
	void getC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter C:");
		c=sc.nextInt();
	}
	void putC()
	{
	    System.out.println("C:"+c);	
	}
	
	z()
	{
		System.out.println("Default constructor called.");
	}
	void show()
	{
		super.show();
		System.out.println("Show from Z");
	}
}

public class multilevel {

    public static void main(String[] args) {
		
    	z z1=new z();
    	z1.getA();
    	z1.getB();
    	z1.getC();
    	z1.putA();
    	z1.putB();
    	z1.putC();
    	z1.show();
	}
}
