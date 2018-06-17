package interview;

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

public class ReadingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String empDetailFile ="C:\\Users\\Tharshini\\employee5.csv";
		
		
	    ReadingFiles RF = new ReadingFiles();
		RF.readFile1(empDetailFile);
		
		
				
	}		
		public void readFile1(String FileName)throws IOException {
		String line="";
	    ArrayList <String> firstName = new ArrayList<String>();
		ArrayList <String> lastName = new ArrayList<String>();		
		BufferedReader br = new BufferedReader (new FileReader(FileName));
		
		while((line = br.readLine())!=null) {
			String [] rows = line.split(",") ;
			firstName.add(rows[1]);
			lastName.add(rows[2]);
		}
		
		  Set <String>h1 = new HashSet<>();
		  h1.addAll(firstName);
		  firstName.clear();
		  firstName.addAll(h1);
		  
		  Set<String> h2 = new HashSet<>();
		  h2.addAll(lastName);
		  lastName.clear();
		  lastName.addAll(h2);
		  line="";
		  
		  String [] combinedList=new String[lastName.size()];
		  
		  
		//  combinedList[0]=
		  
		  for(int i =0; i<firstName.size(); i++)
		  {    
			  String combined = ""+ lastName.get(i)+ ", "+ firstName.get(i);
			  System.out.println(combined);
			  combinedList[i]= combined;
			  			  
			//  System.out.println("Printing combined list");
			  System.out.println(combinedList[i]);
			  
		  } 
		  
		  for(int i=0; i<combinedList.length;i++)
		  { 
			  
			  try {
					PrintWriter  writer = new PrintWriter(new FileWriter("C:/Users/Tharshini/Desktop/JavaOutput/oldfile4.txt",true));
					
					writer.println(combinedList[i]);
					 
			  
			  }catch (IOException e) {
				            //exception handling left as an exercise for the reader
			 
			  }
		  }
		
		}
		

}
				

				
	


