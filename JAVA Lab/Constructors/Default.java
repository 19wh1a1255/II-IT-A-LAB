//Default
class Base
{
   Base()
   {
     System.out.println("Base class\n");
   }
}
class Child extends Base
{
  Child()
  {
     System.out.println("Child class\n");
}
}
class Default
{
    public static void main(String[] args)
    {
        Child obj = new Child();
}
}
