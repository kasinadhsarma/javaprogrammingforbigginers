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

public class inheritance_3
{
    public static void main (String args[])
    {
        b obj2 = new b();
        obj2.add();
    }
}
