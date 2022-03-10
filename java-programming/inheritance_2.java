class a
{
    int a,b;
    void set (int x, int y)
    {
        a=x;
        b=y;
    }
}
class b extends a
{
    int total =0;
    void add()
    {
        total = a+b;
        System.out.println("total = " + total );
    }
}
class c extends b
{
	int t2 =0;
	void sub()
	{
		t2 =a-b;
		System.out.println("sub = "+t2);
	}
}

class inheritance_2
{
    public static void main (String args[])
    {
        c obj = new c();
        obj.set(10,20);
        obj.add();
        obj.sub();
    }
}
