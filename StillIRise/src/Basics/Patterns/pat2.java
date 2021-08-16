package Basics.Patterns;

public class pat2 {

    public static void main(String[] args) {

        int n=4;
        int m=4;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i>=j)
                    System.out.print(j+1+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
