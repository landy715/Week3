import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class H301{
	public static void main(String[] args)
	{
		long sum = 0;
		Pattern p = Pattern.compile("\\d+");
		Scanner input = new Scanner(System.in);
		System .out.println("Input: ");
		String n = input.nextLine();
		String[] token = n.split("\\W+");
		for(String tokens:token){
			Matcher m = p.matcher(tokens);
			if(m.matches()==true){
				long i =Long.valueOf(tokens);
				sum+=i;			
			}else if(tokens.length()>0){
				System.out.println(tokens.toLowerCase());
			}
		}
		System.out.println(sum);

	}
}