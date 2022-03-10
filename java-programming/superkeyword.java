class a{
int v;
}
class b extends a{
int v;
public void set (int a , int b){
this.v=a;
super.v=b;
}
public void display(){
System.out.println(this.v);
System.out.println(super.v);
}
}
class superkeyword{
public static void main(String args[])
{
b b1=new b();
b1.set(2,3);
b1.display();
}
}