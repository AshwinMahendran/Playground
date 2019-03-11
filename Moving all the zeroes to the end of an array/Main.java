import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int inputArray[]=new int[n];
      for(int i=0;i<n;i++)
      {
        inputArray[i]=in.nextInt();
      }
      int currentIndex = 0;
        //3
        for (int i = 0; i < inputArray.length; i++) {
           //4
            if (inputArray[i] != 0) {
                inputArray[currentIndex] = inputArray[i];
                currentIndex++;
            }
        }
        //5
        while (currentIndex < inputArray.length) {
            inputArray[currentIndex] = 0;
            currentIndex++;
        }
        //6
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]+" ");
        }
    }
}



