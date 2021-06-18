public class TryCatch{

     public static void main(String []args){
        	    try 
	    {
	        int data=20/0;
	    }
	    catch(ArithmeticException e)
	    {
	        System.out.println(e);
	    }
		System.out.println("End of code");
	}
}
