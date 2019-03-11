import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int f=a/100;
    int s=(a/10)%10;
    int l=a%10;
    int sum=((l*100)+(s*10)+f);
    System.out.println(sum);
    //Type your code here
  }
}