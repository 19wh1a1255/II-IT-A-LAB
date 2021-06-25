//Multiple inheritance
class parent
{
    void test()
    {
        System.out.println("parent");
    }
}
class child extends parent
{
    void demo()
    {
        System.out.println("child");
    }
}
class child2 extends child
{
    void multi()
    {
        System.out.println("child2");
    }
}
class Multipleinheritance
{
    public static void main(String args[])
    {
        child2 obj = new child2();
        obj.multi();
        obj.demo();
        obj.test();
    }
}
