import java.util.Scanner;
class Add1
{
int a,b,c;
void add()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value for a:");
a=sc.nextInt();
System.out.println("Enter value for b:");
b=sc.nextInt();
c=a+b;
System.out.println("Addition:"+c);
}
public static void main(String args[])
{
Add1 a1=new Add1();
a1.add();
}
}