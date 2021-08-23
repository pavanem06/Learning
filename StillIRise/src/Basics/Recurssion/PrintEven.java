package Basics.Recurssion;

public class PrintEven {

    public static void main(String[] args) {
        printEven(10);
    }

    public static void printEven(int num)
    {
        if(num==1)
            return;
        printEven(num-1);
        if(num%2==0)
            System.out.print(num+" ");
    }
}
