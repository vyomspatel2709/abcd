package Polymorphism;

public class MethodOverloading {
      void test()
      {
    	  System.out.println("Test with no argument");
      }
      void test(int a)
      {
    	  System.out.println("Test with 1 argumnet");
      }
      void test(double a,double b)
      {
    	  System.out.println("Test with 2 argument");
      }
      void test(int a,double b)
      {
    	  System.out.println("Test with 2 int argument");
      }
      public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.test(10);
		m.test();
		m.test(10.1,20.1);
	}
	
	
}
	     
