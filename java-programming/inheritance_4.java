class a
{
    public void add() 
    {
        System.out.println("1 st " );
    }
}
class b extends a
{
    public void add()
    {
        System.out.println(" 2 nd " );
    }
}
class c extends a
{
	public void add()
	{
		System.out.println("3rd");
	}
}

public class inheritance_4 
{
    public static void main (String args[])
    {
        a obj1 = new a();
        a obj2 = new b();
	a obj3 = new c();
	obj1.add();
	obj2.add();
	obj3.add();
    }
}
