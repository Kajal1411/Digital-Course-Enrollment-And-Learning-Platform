class abc
{
public int rollno=10;
void change()
{
rollno++;
System.out.println(rollno);
}
public static void main(String args[])
{
abc a=new abc();
a.change();
a.change();
a.change();
}
}