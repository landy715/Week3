import java.util.*;
import java.util.Scanner;
class H302{
	
	public static void main(String[] args)
	{
		HashMap<String, Integer> t = new HashMap<String, Integer>();
		Scanner input = new Scanner(System.in);
		int grade=0,opt=0;
		while(true)
		{
			 System.out.print("1) Input 2)search -1)BYE?\n");
			 opt=input.nextInt();
			 input.nextLine();
			 if(opt==-1)
				break;
			 if(opt==1){
				 System .out.println("Input name and grade: ");
				 String n = input.nextLine();
				 String temp = input.nextLine();
				 grade=Integer.valueOf(temp);
				 t.put(n,grade);

			 }
			else{
				System .out.println("Input name and grade: ");
				String n = input.nextLine();
				grade = t.get(n);
				System.out.println(grade);
			}			
	    }

	}
}