package Basics.OOPS.Inheritance;

public class Inheritance01 {
    public static void main(String[] args) {
        pavan obj1 = new pavan();
//        pavan obj2 = new tools();
        tools obj3 = new tools();
        tools obj4 = new pavan();
//        try {
//            pavan obj5 = (pavan) new tools();
//        }catch (Exception e)
//        {
//            System.out.println("Object Exception");
//        }
        tools obj6 = new pavan();

        System.out.println(obj1.name1);   //Abhi
        System.out.println(((tools)obj1).name1); //Mille
        System.out.println(obj1.name2);  //Deekshi
        System.out.println(((tools)obj1).name2);  //Deeks

        obj1.call1();  //Rathna
        ((tools)obj1).call1();  //Kera
        obj1.call2();  //Sourab
        ((tools)obj1).call2(); //Sourabh
        System.out.println("===============================");

        System.out.println(obj3.name1);  //Mille
        System.out.println(obj3.name2);  //Deeks
        try {
            System.out.println(((pavan)obj3).name1);   //CCE
        } catch (Exception e) {
            System.out.println("CCE from obj3 1");
        }
        try {
            System.out.println(((pavan)obj3).name2);   //CCE
        } catch (Exception e) {
            System.out.println("CCE from obj3 2");
        }
        try {
            ((pavan)obj3).call1();   //CCE
        } catch (Exception e) {
            System.out.println("CCE from obj3 3");
        }
        try {
            ((pavan)obj3).call2();  //CCE
        } catch (Exception e) {
            System.out.println("CCE from obj3 4");
        }
        System.out.println("====================================");

        System.out.println(obj4.name1);  //Mille
        System.out.println(((pavan)obj4).name1);  //Abhi
        System.out.println(obj4.name2); //Deeks
        System.out.println(((pavan)obj4).name2);//Deekshi

        obj4.call1(); //kera
        ((pavan)obj4).call1(); //Rathna
        obj4.call2(); //Sorabh
        ((pavan)obj4).call2(); //Sourab
        System.out.println("======================================");

//        System.out.println(obj5.name1); //Abhi
//        System.out.println(((tools)obj5).name1); //Mille
//        try {
//            System.out.println(obj5.name2); //CCE
//        }catch (Exception e)
//        {
//            System.out.println("CCE from obj5 1");
//        }
//        try {
//            System.out.println(((tools) obj5).name2); //Deeks
//        }catch (Exception e)
//        {
//            System.out.println("CCE from obj5 2");
//        }
//
//        obj5.call1(); //rathna
//        ((tools)obj5).call1(); //Kera
//        try {
//            obj5.call2(); //CCE
//        }catch (Exception e)
//        {
//            System.out.println("CCE from obj5 3");
//        }
//        ((tools)obj5).call2(); //Jordan
        System.out.println("============================");

        System.out.println(obj6.name1);//Mille
        System.out.println(((pavan)obj6).name1);//Abhi
        System.out.println(obj6.name2); //Deeks
        System.out.println(((pavan)obj6).name2); //Deekshi

        obj6.call1(); //Kera
        try{
            ((pavan)obj6).call1(); //rathna
        }catch (Exception e)
        {
            System.out.println("CCE from obj6 1");
        }
        obj6.call2(); //Sourabh
        try{
            ((pavan)obj6).call2();  //Sourabh
        }catch (Exception e)
        {
            System.out.println("CCE from obj6 2");
        }
    }
}

class pavan extends  tools
{
    static String name1 ="Abhi";
    String name2 ="Deekshi";

    public static void call1()
    {
        System.out.println("Rathna");
    }

    public void call2()
    {
        System.out.println("Sourabh");
    }
}

class tools
{
    static String name1 ="Mille";
    String name2 ="Deeks";

    public static void call1()
    {
        System.out.println("Kera");
    }

    public void call2()
    {
        System.out.println("Jordan");
    }
}
