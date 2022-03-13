class box1
{
    int l, b,h;
    public void  display()
        {
            l = 2;
            b = 3;
            h = 4;
            System.out.println ("The value of L is : " + l);
            System.out.println ("The value of B is : " + b);
            System.out.println ("The value of H is : " + h);
        }  
}
class box_1
{
    public static void main(String[] args)
    {
        box1  b1 = new box1();
        b1.display();
    }
}
