import java.util.Scanner;

class E
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
}
class F extends E
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
	
}
class G extends E
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
	
}
class H extends E
{
	int d;
	void getD()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter D:");
		d=sc.nextInt();
	}
	void putD()
	{
		System.out.println("D:"+d);
	}
	
}
public class Hierarchial {

	public static void main(String[] args) {
		F f1=new F();
		f1.getA();
		f1.getB();
		
		G g1=new G();
		g1.getC();
		
		H h1=new H();
		h1.getD();
		
		f1.putA();
		f1.putB();
		g1.putC();
		h1.putD();
	
	}
}
