package Basics.Patterns;

public class Pat1 {

    public static void main(String[] args) {


        int n = 5;
        int m = 5;

        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++)
            {
                if(i+j<=n-1)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
