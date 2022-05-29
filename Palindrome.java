import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
      String str,str_rev="",final_str;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String : ");
      str=sc.nextLine();
      final_str=str.toLowerCase();
      //String str2=nextLine(); //to Compare two strings are equals
      for(int i=(final_str.length()-1);i>=0;i--) //comment for loop for check 2 string from user are equals
        str_rev+=final_str.charAt(i);
      if(final_str.equals(str_rev)) //if(str.equals(str2)) for comparing 2 string given by user
        System.out.print(final_str+" and "+str_rev+" are palindrome");
      else
        System.out.print(final_str+" and "+str_rev+" are not in palindrome");
      sc.close();
        
    }
}
