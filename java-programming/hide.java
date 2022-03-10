interface i1
{
	public void set();
}
class hide implements i1
{
	public void set()
	{
		System.out.println("interface called");
	}
public static void main(String args[])
{
	hide d1=new hide();
	d1.set();
}
}
