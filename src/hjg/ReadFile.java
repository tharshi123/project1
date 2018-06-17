package hjg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		String empDetailFile ="C:\\Users\\Tharshini\\employee5.csv";
		//C:\\TestResults\\country.csv
		BufferedReader br = null;
		String line ="";
		String columsplit =",";
		
		//List <String> firstName[];
		ArrayList<String> firstName = new ArrayList<String>();
		ArrayList<String> dedupefirstname = new ArrayList<String>();
		 try {
			
			 br= new BufferedReader(new FileReader(empDetailFile));
			 System.out.println("read");
			 int i =0 ;
		
			 while ((line= br.readLine())!=null) {
			
			String [] employees= line.split(columsplit);
		    
			firstName.add(employees[1]);
			
		    System.out.println("Firstname"+ employees[1]);
			
			i++;
			
			 }
	
		 } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	
		 
		 System.out.println("printing Firstname list");
		 
		 for(int x=0; x <firstName.size();x++) {
			  System.out.println(firstName.get(x));
			  dedupefirstname.add(firstName.get(x)); 
			  			  
		 }
		 
		 		// add elements to al, including duplicates
		 	Set<String> hs = new HashSet<>();
		 	hs.addAll(firstName);
		 	firstName.clear();
		 	firstName.addAll(hs);
		 
		 
		 	
		 System.out.println("Now printing dedup list");
		 for(int x=0; x <firstName.size();x++) {
			  System.out.println(firstName.get(x));
		
			 
		 
		 
		 try {
		       
	        	PrintWriter writer = new PrintWriter(new FileWriter("C:/Users/Tharshini/Desktop/JavaOutput/oldfile1.txt",true));
	        
	        	writer.println(firstName.get(x));
	        	writer.close();
	        
	        }catch (IOException e) {
	            //exception handling left as an exercise for the reader
	        }	 
		 
		 }
		 	
	}

	
	
	
}
