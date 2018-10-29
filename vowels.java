import java.util.Scanner;
class vowels{
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String full=sc.nextLine();
		System.out.println("String without vowels is : ");
		for(int i=0;i<full.length();i++){
			char c=full.charAt(i);
			if(c=='a'|| c=='e'|| c=='i' || c=='o' || c=='u'){
				
			}
			else{
				System.out.print(c);
			}
		}
	}
}