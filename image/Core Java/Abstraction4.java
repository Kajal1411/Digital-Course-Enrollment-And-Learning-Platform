abstract class Demo
{
int a,b;
Demo()
{
a=10;
b=5;
}
abstract void add();
}
class 
 extends Demo
{
void add()
{
int c=a+b;
System.out.println("Addition:"+c);
}
public static void main(String args[])
{
Demo d=new Abstraction4();
d.add();
}
}
