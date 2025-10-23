import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
    //q1
    // for (int i = 1; i <=25; i++)
    // {
    //   System.out.println(i);
    // }

    //q2
    // int count = 0;
    // for (int i = 17; i <= 73; i++) 
    // {
    //   count++;
    //   System.out.print(i + " ");
    //   if (count == 10) {
    //     count = 0;
    //     System.out.println();
    //   }
    // }
      
    //q3
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number between 0 to 50");
    int num = sc.nextInt();

    while (num <= 50) {
      for (int i = 1; i <= 5; i++) {
        if (num <= 50) {
          System.out.print(num + " ");
          num++;
        }
      }
      System.out.println();
    }
    

    //q4
  }
}
