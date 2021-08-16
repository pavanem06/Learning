package Basics.StoringIntDouble;

public class SwitchStatement {

    public static void main(String[] args) {

        int num =10;

        switch (1)
        {
            case 1:
                System.out.println(1);
                System.out.println(1);
                for(int i=5;i<10;i++)
                    System.out.println(i);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println(10);
                break;
        }
    }
}
