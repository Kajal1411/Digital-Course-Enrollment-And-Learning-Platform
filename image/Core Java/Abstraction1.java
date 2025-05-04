import java.util.Scanner;
abstract class Demo
{
abstract void add();
}
class Abstraction1 extends Demo
{
void add()
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter first num:");
a=sc.nextInt();
System.out.println("Enter second num:");
b=sc.nextInt();
int c=a+b;
System.out.println("Addition:"+c);
}
public static void main(String args[])
{
Demo d=new Abstraction1();
d.add();
}
}