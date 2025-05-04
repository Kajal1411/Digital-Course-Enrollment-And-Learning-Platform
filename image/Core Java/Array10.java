//8.find even and odd from array and find sum of even element and sum of odd element.



import java.util.Scanner;
class Array10
{
public static void main(String args[])
{
int[] A=new int[10];
int i,sumodd=0,sumeven=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements:");
for(i=0;i<=9;i++)
{
A[i]=sc.nextInt();
}
for(i=0;i<=9;i++)
{
if(A[i]%2==0)
{
sumeven=sumeven+A[i];
}
else
{
sumodd=sumodd+A[i];
}
}
System.out.println("Sum of even numbers:"+sumeven);
System.out.println("Sum of odd numbers:"+sumodd);
}
}