import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
      int num;
      boolean isnotprime=false;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      for(int i=2;i<num;i++){
        if(num%i==0){
          isnotprime=true;
          break;
        }
      }
      if(isnotprime)
        System.out.print(num+" is not prime");
      else
        System.out.print(num+" is  prime");
        
    }
}
