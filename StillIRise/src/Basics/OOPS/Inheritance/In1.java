package Basics.OOPS.Inheritance;

public class In1 extends inheri2{

    int acc=420;


    public static void main(String[] args) {
        new In1().call();
        In1 obj1 =new In1();
        obj1.call2();  //im from child
        inheri2 obj2 = new inheri2();
        obj2.call2();   //im from Parent
        ((inheri2)obj1).call2();  //im from child
       // ((In1)obj2).call2();  //cce

        System.out.println(obj1.acc);
        System.out.println(obj2.acc);
        System.out.println(((inheri2)obj1).acc);
        System.out.println(((In1)obj2).acc);
    }

    public void call()
    {
        System.out.println(this.acc);
        System.out.println(super.acc);
    }

    public void call2()
    {
        System.out.println("I'm from child");
    }
}

class inheri2
{
    int acc=840;

    public static void main(String[] args) {

    }

    public void call2()
    {
        System.out.println("I'm from Parent");
    }
}
