 import java.util.*;
 class substring { 
 public static void main(String[] args) 
    { 
	String s="";
	System.out.println("Enter the string: ");
	Scanner sc=new Scanner(System.in);
    String full =sc.next(); 
        for (int i = 0; i< full.length(); i++)
      {
         for(int j = 0; j <= full.length()-i; j++)
         {
            s = full.substring(i,i+j);
            System.out.println(s);
         }
      }
    } 
} 