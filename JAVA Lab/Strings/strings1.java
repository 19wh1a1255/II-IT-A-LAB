public class Main
{
	public static void main(String[] args)
	{   
	    String s = "#Welcome, To, Java, Programming:)";
	    int i;
	    String s1 = " Hello ";
	    String s2 = " World :)";
	    String s3 = s1.concat(s2);
	    System.out.println(s3);
	    int len = s3.length();
	    System.out.println(len);
	    char pos = s3.charAt(5);
	    System.out.println(pos);
	    int comp = s1.compareTo(s2);
	    System.out.println("Comparision of the strings is: "+comp);
	    System.out.println(s1.equals(s2));
	    System.out.println("Starting char of string s1 is: " +s1.startsWith("W"));
	    System.out.println("String s1 ends with: " +s1.endsWith("o"));
	    System.out.println("Index value : "+s1.indexOf("e"));
	    System.out.println("Last index: "+s1.lastIndexOf("l"));
	    System.out.println("Substring: "+s1.substring(0, 3));
		System.out.println("Uppercase of S1 string is : "+s1.toUpperCase());
		System.out.println("Lower case of string S1 is : "+s1.toLowerCase());
		System.out.println("Trim: "+s2.trim());
		String a[] = s1.split("");
		System.out.println("Splitted string:");
		for(i=0;i<a.length;i++)
		{
		    System.out.println(a[i]);
		}
		System.out.println("Replaced string: "+s1.replace("ll","r"));
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s2.compareToIgnoreCase(s1));
	}
}

