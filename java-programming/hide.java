interface a
{
	int a=1;
	public void set();
}
interface a1 extends a
{
	int a1=2;
	public void add();
}
interface a2 extends a
{
	int a2=3;
	public void sub();
}
interface a3 extends a1,a2
{
	int a3=4;
	public void show();
}
class hide implements a3
{
	public void set()
	{
		System.out.println("a called" +a);
	}
	public void add()
	{
		System.out.println("a1 called" +a1);
	}
	public void sub()
	{
		System.out.println("a2 called" +a2);
	}
	public void show()
	{
		System.out.println("a3 called" +a3);
	}
	








	public static void main(String args[])
	{
		hide h1=new hide();
		h1.set();
		h1.add();
		h1.sub();
		h1.show();
	}
}
