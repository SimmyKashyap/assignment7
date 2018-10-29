import java.util.*;
class reverse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String reverse="";
		System.out.println("Enter the string: ");
		String real=sc.next();
		for(int i=real.length()-1;i>=0;i--){
		 reverse +=real.charAt(i)+"";
		}
		System.out.println("Reverse is : "+reverse);
		
	}
}