package Basics.OOPS.Inheritance;

public class Inheritance2 {

    public static void main(String[] args) {
        System.out.println(In02.name);

        In01 o1 = new In01();
        Object o2 = new In02();
    }
}

class In01 extends In02
{
    static String name="Pavan";
    static {
        System.out.println("From In01");
    }
    {
        System.out.println("From Non-Static In01");
    }
}

class In02
{
    static String name ="Tools";
    static{
        System.out.println("From In02");
    }
    {
        System.out.println("From Non-Static In02");
}
}
