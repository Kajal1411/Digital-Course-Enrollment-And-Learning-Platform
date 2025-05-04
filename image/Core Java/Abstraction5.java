abstract class Demo
{
int a,b;
Demo(int a,int b)
{
this.a=a;
this.b=b;
}
abstract void add();
}
class Abstraction5 extends Demo
{
Abstraction5()
{
super(10,10);
}
void add()
{
int c=a+b;
System.out.println("Addition:"+c);
}
public static void main(String args[])
{
Demo d=new Abstraction5();
d.add();
}
}
