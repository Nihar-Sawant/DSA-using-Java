import java.util.*;

public class Fibonacci {
  
  
  public static void fibonacci_calculator(int ip){
    int res=0;
    for(int i=1;i<=ip;i++)
      res+=i;
    System.out.println("Result : "+res);
  }
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input=sc.nextInt();
        fibonacci_calculator(input);
    }
}