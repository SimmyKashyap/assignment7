import java.util.*;
import java.util.regex.*;
class occurence{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
 System.out.println("Enter the first string: ");
 String one=sc.nextLine();
 System.out.println("Enter the second String : ");
 String two=sc.nextLine();
 Pattern p = Pattern.compile(two);
Matcher m = p.matcher(one);
int count = 0;
while (m.find()){
    count +=1;
}
System.out.println(count);  
	}
}