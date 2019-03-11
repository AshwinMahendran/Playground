import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int hcf;
      int st=a<b?(a<c?a:c):(b<c?b:c);
      for(hcf=st;hcf>=1;hcf--)
      {
        if(a%hcf==0 && b%hcf==0 && c%hcf==0)
          break;
      }
      System.out.println(hcf);
	    // Type your code here
	}
}