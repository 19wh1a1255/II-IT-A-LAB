class Base
{
    int num = 25;
}
class Child extends Base
{
     int num = 20;
     void show()
{
     System.out.println(+num);
     System.out.println(+super.num);
}
}

class Super
{
public static void main(String[] args)
{
   Child obj = new Child();
   obj.show();
}
}
