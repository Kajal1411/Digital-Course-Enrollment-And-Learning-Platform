/* 1 * 3
   * 5 *
   7 * 9 */


/*import java.util.Scanner;
class Array18
{
public static void main(String args[])
{
int[][] a=new int[3][3];
int i,j;
char ch='*';
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.println("Array:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
if((i==1||j==1)&&(i!=j))
{
System.out.print(ch+"\t");
}
else
{
System.out.print(a[i][j]+"\t");
}
}
System.out.println();
}

}
}*/

import java.util.Scanner;
class Array18
{
public static void main(String args[])
{
int[][] a=new int[3][3];
int i,j;
char ch='*';
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.println("Array:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
if(a[i][j]%2==0)
{
System.out.print(a[i][j]+"\t");

}
else
{
System.out.print(ch+"\t");

}
}
System.out.println();
}

}
}