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
class inheritance
{
    public static void main (String args[])
    {
        b obj = new b();
        obj.set(10,20);
        obj.add();
    }
}
