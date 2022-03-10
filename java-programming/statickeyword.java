class statickeyword
{
        int a=5 , b =6;
        static int c;
        void show()
        {
                System.out.println(a);
                System.out.println(b);
        }
        static void display()
        {
                System.out.println(c);
        }
static
{
        System.out.println(" Static block =");
}
static
{
        System.out.println("Static block =");
}

public static void main(String args[])
{
        statickeyword obj=new statickeyword();
        obj.show();
         statickeyword.display();
    }
}


