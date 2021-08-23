package Basics.DynamicProgramming;

public class PrimeNumber {

    public static void main(String[] args) {
        int num=5;
        if(isPrime(num))
            System.out.println(num+" is a Prime Number");
        else
            System.out.println(num+" is not a Prime Number");

    }

    public static boolean isPrime(int num)
    {
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
