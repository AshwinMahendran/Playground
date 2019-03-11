import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int N=in.nextInt();
  
for(int i=1; i<=N; i++)
    {
        /* Iterate over each column */
        for(int j=1; j<=N; j++)
        {
            if(i==1 || i==N || j==1 || j==N)
            {
                /* Print star for 1st, Nth row and column */
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }

        /* Move to the next line/row */
        System.out.print("\n");
    }
    }
}