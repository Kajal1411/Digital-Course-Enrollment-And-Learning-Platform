class abc1
{
public static int rollno=10;
void change()
{
rollno++;
System.out.println(rollno);
}
public static void main(String args[])
{
abc1 a=new abc1();
a.change();
a.change();
a.change();
}
}