package hjg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DedupeData {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stubFileNotFoundException
		
		BufferedReader br ;
		
		FileReader atualFile = new FileReader("C:\\\\Users\\\\Tharshini\\\\employee5.csv");
		br = new BufferedReader(atualFile);
		String line ="";
		String columsplit =",";
		
		ArrayList <String> firstName= new ArrayList<String>();
		ArrayList <String> lastName = new ArrayList<String>();
		ArrayList <String> empId = new ArrayList <String>();
		ArrayList <String> salary	= new ArrayList<String>();
		
		
        while ((line= br.readLine())!= null) {
        	
        	String[] employee = line.split(columsplit);
        	firstName.add(employee[1]);
        	lastName.add(employee[2]);
        	empId.add(employee[0]);
        	salary.add(employee[3]);
        	
        	
        	
        }
        Set<String> dedupefirst = new HashSet<>();
        dedupefirst.addAll(firstName);
        firstName.clear();
        firstName.addAll(dedupefirst);
        
        
        PrintWriter newfile = new PrintWriter(new FileWriter("C:/Users/Tharshini/Desktop/JavaOutput/oldfile2.txt",true));
        

        
        for(int i=0; i<firstName.size();i++)
        { 
        	newfile.println(firstName.get(i));
        	//System.out.println(firstName.get(i));
        	
        	
        }
        
        newfile.close();
        
        for(int i=0; i<firstName.size();i++)
        { 
        	System.out.println(firstName.get(i));
        	//System.out.println(firstName.get(i));
        	
        	
        }
        
        
        
        
	}

}
