class adi
{
    int l,b,h;
    adi()
    {
        System.out.println("Default constructor");
    }
    adi(int l, int b, int h)
   {
        System.out.println("box l,b,h" +l+" "+b+" "+h);
    }
    public void dis()
   {
        l=1;
        b=2;
        h=3;
        System.out.println("the value of l="+l+" ,b="+b+" ,h="+h);
    }
}
class box_2
{
    public static void main(String[] args){
       adi constr = new adi();
        adi constr1=new adi(2,4,6);
        constr1.dis();
    }
}