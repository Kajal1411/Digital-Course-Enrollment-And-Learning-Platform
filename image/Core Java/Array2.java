import java.util.Scanner;
class Array2
{
public static void main(String args[])
{
int[] A=new int[15];   //needs to declare specific size.
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
n=sc.nextInt();
System.out.println("Enter array elements:");
for(i=0;i<n;i++)
{
A[i]=sc.nextInt();
}
System.out.println("Array elements are:");
for(i=0;i<n;i++)
{
System.out.println(A[i]);
}
}
}