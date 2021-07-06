import java.util.*;
class ReverseString
{
public static void main(String[] args)
{
String str = "Bruce Banner";
char a[] = str.toCharArray();
System.out.print("Reversed string: ");
for(int i=a.length-1;i>=0;i--)
{
System.out.print(a[i]);
}
}
}
