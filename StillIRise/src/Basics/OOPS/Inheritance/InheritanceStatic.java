package Basics.OOPS.Inheritance;

public class InheritanceStatic {

    public static void main(String[] args) {

        System.out.println(static1.name);
 //       System.out.println(static2.age);    Not able to Use
    }
}

class static1 extends static2
{
    static String age="24";
    public static void main(String[] args) {

    }
}

class static2
{
    static String name ="Pavan";
    public static void main(String[] args) {

    }
}
