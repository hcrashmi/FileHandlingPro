package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String args[]) throws IOException {  
	      FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	         in = new FileInputStream("D:\\HCR\\sourceFile.txt");
	        // out = new FileOutputStream("D:\\HCR\\targetFile.txt");
	         
	         String str="";String str1="";
	         out = new FileOutputStream(str);
	         
	         
	         int c;
	               
	         while ((c = in.read()) != -1)
	         {
	           
	        	 out.write(c);
	        	 
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
}
