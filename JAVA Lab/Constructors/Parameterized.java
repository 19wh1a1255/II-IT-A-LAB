//Prameterized
class Parent
{
   Parent(int x)
   {
      int a = x;
     System.out.println("value of a is "+a);
   }
   Parent()
{
     System.out.println("\nParent Class");
}
}
class Child extends Parent
{
    Child()
    {
        super(100);
        System.out.println("\nChild class");   
}
   
}
class Parameterized
{
    public static void main(String[] args)
    {
       Child obj = new Child();
    }
}
