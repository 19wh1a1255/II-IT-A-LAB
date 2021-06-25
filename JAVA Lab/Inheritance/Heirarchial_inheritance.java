// Heirarchial inheritance
class A
{
    void test()
    {
        System.out.println("A");
    }
}
class B extends A
{
    void demo()
    {
        System.out.println("B");
    }
}
class C extends A
{
    void display()
    {
        System.out.println("C");
    }
}
class Heirarchialinheritance
{
    public static void main(String args[])
    {
        C obj = new C();
        obj.display();
        obj.test();
    }
}
