import java.util.Scanner;

public class Main {
  public static int reverseTheNumber(int num)
  {
      int sum=0;
      while(num != 0){
          int digit = num%10;
          sum = sum*10 + digit;
          num = num/10;
      }
      return sum;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter a number");
    n = sc.nextInt();

    int res = reverseTheNumber(n);

    System.out.println("Reversed number = " + 
    res);
  }
}