import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    for (int i = 1; i <=25; i++)
    {
      System.out.println(i);
    }


    int count = 0;
    for (int i = 17; i <= 73; i++) 
    {
      count++;
      System.out.print(i + " ");
      if (count == 10) {
        count = 0;
        System.out.println();
      }
    }
      

    Scanner sc = new Scanner(System.in);
    System.out.println()
    
  }
}
