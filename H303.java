import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class H303{
	public static void main(String[] args) throws IOException
	{	
		HashMap<String, Integer> t = new HashMap<String, Integer>();
		long sum = 0;
		Pattern p = Pattern.compile("\\d+");
		FileReader file = new FileReader("D:\\HW303.txt");
		BufferedReader reader = new BufferedReader(file);
		String line = reader.readLine();
		while(line!=null)
		{
			String[] token = n.split("\\W+");
			for(String tokens:token){
				String s = tokens.toLowerCase();
				if(t.containsKey(s)==true){
					int v=t.get(s);
					v++;
					t.put(s,v);
				}
				else{
					t.put(s,1);
				}
			}
		}
		Scanner input = new Scanner(System.in);
		System .out.println("Input: ");
		String n = input.nextLine();
		String[] token = n.split("\\W+");
		for(String tokens:token){
			String s = tokens.toLowerCase();
			if(t.containsKey(s)==true){
				int v=t.get(s);
				v++;
				t.put(s,v);
			}
			else{
				t.put(s,1);
			}
		}
		Set<String> set = t.keySet();
		Iterator<String> I= set.iterator();
		while(I.hasNext()){
			String key=I.next();
			int count=t.get(key);
			System.out.println(key + "\t" + count);
			File file = new File("D:\\HW303.txt");
			OutputStream is =new FileOutputStream(file);
			OutputStreamWriter isr= new OutputStreamWriter(is);
			BufferedWriter br = new BufferedWriter(isr);
			br.write(key + "\t" + count);
			br.newLine();
			br.flush();
			br.close();
		}		
	}
}
