package Basics.DynamicProgramming;

public class PrintOddPrintNumberOfEven {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 25;
        printOddNumber(num1, num2);

        System.out.println("Number of Even Number :"+countOfEven(num1,num2));

    }

    public static void printOddNumber(int num1 , int num2)
    {
        for(int i=num1+1;i<num2;i++)
        {
            if(i%2==1)
                System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int countOfEven(int num1, int num2)
    {
        int count=0;
        for(int i=num1+1;i<num2;i++)
        {
            if(i%2==0)
                count++;
        }
        return count;
    }
}
