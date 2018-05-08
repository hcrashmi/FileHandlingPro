package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SrcDst
{
	static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
         
        String oldContent = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
     
	
	public static void main(String[] args) throws Exception 
	{
		String source ="D:\\HCR\\sourceFile.txt";
		   String dest = "D:\\HCR\\targetFile.txt";

		    File fin = new File(source);
		    FileInputStream fis = new FileInputStream(fin);
		    BufferedReader in = new BufferedReader(new InputStreamReader(fis));

		    FileWriter fstream = new FileWriter(dest, true);
		    BufferedWriter out = new BufferedWriter(fstream);
		   
		    String aLine = null;
		    while ((aLine = in.readLine()) != null) 
		    {
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
		    // do not forget to close the buffer reader
		    in.close();

		    // close buffer writer
		    out.close();
		    modifyFile("D:\\HCR\\sourceFile.txt", "1", " ");
		    modifyFile("D:\\HCR\\sourceFile.txt", "2", " ");
	}

}
