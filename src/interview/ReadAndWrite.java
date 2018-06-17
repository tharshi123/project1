package interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\Tharshini\\employee5.csv"));
		 
		 String line = "";
		 //String[] rows = null;
		 int i =0;
		ArrayList <String> rows = new ArrayList<>();
		
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				  rows.add(line);			  
				  i++;
								  
			}
			
			Set <String> h1= new HashSet<> ();
			h1.addAll(rows);
			rows.clear();
			rows.addAll(h1);
			
			System.out.println(" Printing the deduped list");
			PrintWriter writer = new PrintWriter(new FileWriter("C:/Users/Tharshini/Desktop/JavaOutput/oldfile5.txt",true));
			
			 for(int x =0; x<rows.size();x++)
			 { 
				 System.out.println(rows.get(x));
				 writer.println(rows.get(x));
				 
			 }
				
			writer.close();
			
			
		
			 
			 
			 
			 
			 
		}
		
		
	}

