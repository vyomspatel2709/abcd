package Polymorphism;



	class A
	{
		A()
		{
			System.out.println("A is default constructor");
		}
		void show()
		{
			System.out.println("Show from A");
		}
	}
	class B extends A
	{
		B()
		{
			System.out.println("B is default constructor");
		}
		void show()
		{
			super.show();
			System.out.println("Show from B");
		}
	}
	class C extends B
	{
		C()
		{
			System.out.println("C is default constructor");
		}
		void show()
		{
			super.show();
			System.out.println("Show from C");
		}
	}
	public class MethodOverride {
		public static void main(String[] args) {
			
			C c1=new C();
			c1.show();
		}
	}
	
	
	