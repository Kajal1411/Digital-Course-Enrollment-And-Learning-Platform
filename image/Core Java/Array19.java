/* # 2 #
   4 # 6
   # 8 # */


import java.util.Scanner;
class Array19
{
public static void main(String args[])
{
int[][] a=new int[3][3];
int i,j;
char ch='#';
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