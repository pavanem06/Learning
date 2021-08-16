package Basics.StoringIntDouble;

public class loops {

    public static void main(String[] args) {

        int num = 19;
        int i=0;
        while(!(num>=20))
        {
            num=num++;
            System.out.println(num);
            i++;
            System.out.println(i);
            if(i==100)
                break;
        }
        System.out.println(num);
    }
}
