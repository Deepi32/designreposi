/*class A
{
	public static A instance=new A();
	private A()
	{
		System.out.println("Eager initialization");
	}
}

*/
/*
class A
{
	public static A instance;
	private A()
	{
		System.out.println("using static block");
	}
	static{//CPU time wasted 
		System.out.println("static block");
		instance=new A();
	}
}*/
class A implements Runnable
{
	public static A instance=null;
	private A()
	{
		System.out.println("using static block");
	}
	public static A getInstance()
	{
		if(instance==null){
			System.out.println("new instance created");
			instance=new A();}
		return instance;
		
	}
	public void run()
	{
		System.out.println("");
		getInstance();
	}
}
public class SingletonDesign {
	public static void main(String args[])
	{
		A a=A.getInstance();
		Thread t1=new Thread(a);
		A b=A.getInstance();
		Thread t2=new Thread(b);
		t1.start();
		t2.start();
		System.out.println("new instannnce created");
		
	}

}
