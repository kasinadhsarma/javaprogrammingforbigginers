interface i1
{
	public void set();
}
class hide_2 implements i1
{
	public void set()
	{
		System.out.println("interface called");
	}
public static void main(String args[])
{
	hide_2 d1=new hide_2();
	d1.set();
}
}
