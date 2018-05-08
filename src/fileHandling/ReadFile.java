package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		//File dir = new File(".");

	    String source ="D:\\HCR\\sourceFile.txt";
	   String dest = "D:\\HCR\\targetFile.txt";

	    File fin = new File(source);
	    FileInputStream fis = new FileInputStream(fin);
	    BufferedReader in = new BufferedReader(new InputStreamReader(fis));

	    FileWriter fstream = new FileWriter(dest, true);
	    BufferedWriter out = new BufferedWriter(fstream);
	    FileWriter ifstream = new FileWriter(source, true);
	    BufferedWriter inout=new BufferedWriter(ifstream);

	    String aLine = null;
	    while ((aLine = in.readLine()) != null) {
	        //Process each line and add output to Dest.txt file
	    	System.out.println(aLine);
	    	char[] ch=aLine.toCharArray();
	    	for(char c:ch)
	    	{
	    		
	    		if(Character.isDigit(c))
	    		{
	    			
	    			out.write(c);
	    			
	    		}
	    	}
	        //out.write(aLine);
	        out.newLine();
	    }
	    
	    
	    //PrintWriter writer = new PrintWriter(source);
	    
	    while ((aLine = in.readLine()) != null) {
	        //Process each line and add output to Dest.txt file
	    	System.out.println(aLine);
	    	char[] ch=aLine.toCharArray();
	    	for(char c:ch)
	    	{
	    		
	    		if(Character.isDigit(c))
	    		{
	    			
	    			/*writer.print("");
	    		    writer.close();*/
	    			FileOutputStream writer = new FileOutputStream("source");
	    			writer.write(("").getBytes());
	    			writer.close();
	    			//inout.write(' ');
	    			
	    		}
	    	}
	        //out.write(aLine);
	        out.newLine();
	    }

	    // do not forget to close the buffer reader
	    in.close();

	    // close buffer writer
	    out.close();

	}

}
