/* A 2 3
   4 A 6
   7 8 A */



import java.util.Scanner;
class Array17
{
public static void main(String args[])
{
int[][] a=new int[3][3];
int i,j;
char ch='A';
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
if(i==j)
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
}