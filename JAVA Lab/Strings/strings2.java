public class Main
{
	public static void main(String[] args)
	{
	    StringBuffer sb = new StringBuffer("Hello !!!");  
	    System.out.println(sb.length());
	    System.out.println(sb.capacity()); 
        sb.append(" Hello !");  
        System.out.println(sb.capacity());  
        sb.append(" welcomme to the world :)");  
        System.out.println(sb.capacity());
        StringBuffer sb1 = new StringBuffer("Hey");
	    sb1.append(" Java :)");  
        System.out.println(sb1);
        sb1.insert(0, "Java, ");
        System.out.println(sb1);
        sb.delete(1,3); 
        System.out.println(sb);
        sb1.deleteCharAt(0);
        System.out.println(sb1);
        StringBuffer sb2 = new StringBuffer("Hello world! THIS "); 
        sb2.reverse();
        System.out.println(sb2);
        StringBuffer sb3 = new StringBuffer("Hello world! IS "); 
        sb3.replace(5,11,"Java"); 
        System.out.println(sb3);
        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);
        String myStr1 = "Hello friend";
        System.out.println(myStr1.indexOf("friend"));
        System.out.println(myStr1.lastIndexOf("friend"));
        String str1 = "This is a java program";
        System.out.println(str1.substring(0, 7));
        System.out.println(str1.substring(8));
        
        
	}
}
