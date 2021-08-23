package Basics.Methods;

public class CallingMethods {

    public static void main(String[] args) {
        call(1,'a');

    }

    //Example for method over loading
    public static void call(int a,int b)
    {
        System.out.println("int int");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }

    public static void call(int a, char b)
    {
        System.out.println("Int char");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
}
