//single inheritance
class parent
{
    void test()
    {
        System.out.println("Parent");
    }
}
class child extends parent
{
    void demo()
    {
        System.out.println("child");
    }
}
class singleinheritance
{
    public static void main(String args[])
    {
        child obj = new child();
        obj.demo();
        obj.test();
    }
}
