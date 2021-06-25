//Hybrid inheritance
class A
{
    public void test()
    {
        System.out.println("A");
    }
}
class B extends A
{
    public void demo()
    {
        System.out.println("B");
    }
}
class C extends B
{
    public void display()
    {
        System.out.println("C");
    }
}
class D extends B
{
    public void disp()
    {
        System.out.println("D");
    }
}
class Hybridinheritance
{
    public static void main(String args[])
    {
        D obj = new D();
        obj.disp();
        obj.demo();
        obj.test();
    }
}
