class demo
{
    int a,b;
    void set (int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void show()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
class keyword
{
    public static void main(String args[])
    {
        demo obj1=new demo();
        obj1.set(10,20);
        obj1.show();
    }
}
