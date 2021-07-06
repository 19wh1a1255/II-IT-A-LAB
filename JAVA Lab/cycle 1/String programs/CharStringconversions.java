public class CharStringConversions
{
public static void main(String args[])
{
char[] ch={'L', 'o', 'k', 'i', ' ', 'o', 'd', 'i', 'n', 's', 'o', 'n'};
String str=new String(ch);
System.out.println("string: "+str);
String s = "TonyStark";
for(int i=0; i<s.length();i++)
{
char c = s.charAt(i);
System.out.println("Character at "+i+" Position: "+c);
}
}
}
