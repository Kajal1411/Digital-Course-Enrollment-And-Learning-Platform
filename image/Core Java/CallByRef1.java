class CallByRef1
{
int data=50;
public void change(CallByRef1 d2)
{
d2.data=d2.data+100;
}
public static void main(String args[])
{
CallByRef1 d1=new CallByRef1();
System.out.println("Data before change:"+d1.data);
d1.change(d1);
System.out.println("Data after change:"+d1.data);
}
}
