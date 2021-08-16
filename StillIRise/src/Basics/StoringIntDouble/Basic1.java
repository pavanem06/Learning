package Basics.StoringIntDouble;

import java.util.Scanner;

public class Basic1 {

    public static void main(String[] args) {

        int num = (int)(11/2.0);
        System.out.println(num);

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Height of Wall :");
        int wall = s.nextInt();
        System.out.print("Enter the length of oneHop :");
        int oneHop = s.nextInt();
        System.out.print("Enter the Length of fall :");
        int fall = s.nextInt();

        //int num2 = 10/2.0;  ----> int converted into Double so not able to store in int (You've to cast)
        int requiredTime=question1(wall, oneHop, fall);
        System.out.println("Time taken to Climb the Wall :"+requiredTime);
    }

    public static int question1(int wall,int oneHop, int fall) {
        int requiredTime = 0;
        int distanceTravelled = 0;

        for (int i = 1; distanceTravelled < wall; i++) {
            requiredTime = i;
            distanceTravelled =distanceTravelled + oneHop;
            if(!(distanceTravelled>=wall)) {
                distanceTravelled -= fall;
            }
            else {
                break;
            }
        }

        return  requiredTime;
    }
}
