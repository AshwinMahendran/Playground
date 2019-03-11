import java.util.Scanner;
class Main {
	public static void main (String[] args){
     Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sum=0;
     int lastdigit=num%10;
      int firstdigit=num;
      while(num>=10)
      {
        num=num/10;
      }
      firstdigit=num;
      sum=firstdigit+lastdigit;
      System.out.println(sum);
      
      // Type your code here
	}
}