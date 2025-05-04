/*import java.util.Scanner;
class StudentData
{
int rollno;
String name;
static int c,cpp,java;
static float per;
StudentData(int c,int cpp,int java)
{
this.c=c;
this.cpp=cpp;
this.java=java;
}
}


abstract class Marks
{
abstract void display();
}


class Abstraction3 extends Marks
{
void display()
{
int rollno;
String name;
StudentData c;
StudentData cpp;
StudentData java;
float per;
Scanner sc=new Scanner(System.in);
System.out.println("Enter rollno:");
rollno=sc.nextInt();
System.out.println("Enter name:");
name=sc.next();

System.out.println("rollno:"+rollno);
System.out.println("Name:"+name);
per=(StudentData.c+StudentData.cpp+StudentData.java)/3;
System.out.println("Percentage:"+per);
if(per>=70)
{
System.out.print("A grade");
}
else if(per>=35&&per<70)
{
System.out.print("B grade");
}
else
{
System.out.print("Fail");
}
}


public static void main(String args[])
{

StudentData s1=new StudentData(50,50,50);
Marks mm1=new Abstraction3();
mm1.display();
System.out.println();
System.out.println();

StudentData s2=new StudentData(70,50,80);
Marks mm2=new Abstraction3();
mm2.display();
System.out.println();
System.out.println();

StudentData s3=new StudentData(50,60,80);
Marks mm3=new Abstraction3();
mm3.display();
System.out.println();
System.out.println();

StudentData s4=new StudentData(50,60,70);
Marks mm4=new Abstraction3();
mm4.display();
System.out.println();
System.out.println();

StudentData s5=new StudentData(50,80,90);
Marks mm5=new Abstraction3();
mm5.display();
}
}*/






import java.util.Scanner;
class StudentData
{
int rollno;
String name;
static int c,cpp,java;
static float per;
StudentData(int c,int cpp,int java)
{
this.c=c;
this.cpp=cpp;
this.java=java;
}
}

abstract class Marks
{
int  n;
String nm;
Marks(int n,String nm)
{
this.n=n;
this.nm=nm;
}
abstract void display();
}



class Abstraction3 extends Marks
{
Abstraction3()
{
super(1,"Kajal");
/*super(2,"Vaishnavi");
super(3,"Yukta");
super(4,"Dhanashree");
super(5,"Sakshi");*/
}
void display()
{
int rollno;
String name;
StudentData c;
StudentData cpp;
StudentData java;
float per;
Scanner sc=new Scanner(System.in);
System.out.println("Enter rollno:");
rollno=sc.nextInt();
System.out.println("Enter name:");
name=sc.next();

System.out.println(n);
System.out.println(nm);


System.out.println("rollno:"+rollno);
System.out.println("Name:"+name);
per=(StudentData.c+StudentData.cpp+StudentData.java)/3;
System.out.println("Percentage:"+per);
if(per>=70)
{
System.out.print("A grade");
}
else if(per>=35&&per<70)
{
System.out.print("B grade");
}
else
{
System.out.print("Fail");
}
}


public static void main(String args[])
{
StudentData s1=new StudentData(50,50,50);
Marks mm1=new Abstraction3();
mm1.display();
System.out.println();
System.out.println();

StudentData s2=new StudentData(70,50,80);
Marks mm2=new Abstraction3();
mm2.display();
System.out.println();
System.out.println();

StudentData s3=new StudentData(50,60,80);
Marks mm3=new Abstraction3();
mm3.display();
System.out.println();
System.out.println();

StudentData s4=new StudentData(50,60,70);
Marks mm4=new Abstraction3();
mm4.display();
System.out.println();
System.out.println();

StudentData s5=new StudentData(50,80,90);
Marks mm5=new Abstraction3();
mm5.display();
}
}


//use super to call parent constructor






