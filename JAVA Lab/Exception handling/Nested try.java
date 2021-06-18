public class Nestedtryblock{

     public static void main(String []args)
     {
         try
         {
             try
             {
                 System.out.println("going to divide");
                 int a = 25/0;
             }
             catch(Exception e)
             {
                 System.out.println("1st try block exception occured");
             }
             try
             { 
                 int b = 26/0;
             }
             catch(Exception e)
             {
                 System.out.println("2nd try block Exception occured");
             }
             System.out.println("other catch");
        }
        catch(Exception e)
        {
            System.out.println("End of code");
        }
     }
}
	   
