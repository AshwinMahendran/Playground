import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int j,i;
      for(j=1,i=1;j<=n;i=i+2,j++)
        System.out.println(i);
	}
}