import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
      String str,str_rev="";
      Scanner sc=new Scanner(System.in);
      str=sc.nextLine();
      //String str2=nextLine(); //to Compare two strings are equals
      for(int i=(str.length()-1);i>=0;i--) //comment for loop for check 2 string from user are equals
        str_rev+=str.charAt(i);
      if(str.equals(str_rev)) //if(str.equals(str2)) for comparing 2 string given by user
        System.out.print(str+" and "+str_rev+" are palindrome");
      else
        System.out.print(str+" and "+str_rev+" are not in palindrome");
        
    }
}
