import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int i,n;
      n=in.nextInt();
      for(i=0;i<=n;i++)
      {
        if(i%2!=0)
        {
          System.out.println(i);
        }
      }
	}
}