import java.util.*;
class SortArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Size: ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.print("Enter elements into array: ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i] > a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.print("sorted array: ");
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}
