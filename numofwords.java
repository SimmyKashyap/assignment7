import java.util.*;
class numofwords{
	public static void main(String[] args){
		System.out.println("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int count = 1;
       for (int i = 0; i < input.length() - 1; i++)
		{
			if ((input.charAt(i) == ' ') && (input.charAt(i + 1) != ' '))
			{ count++;}
		}
 		System.out.println("Number of words in a string = " + count);
	}
}
