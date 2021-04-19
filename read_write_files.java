package myStudyApp;

import java.io.*;
import java.util.*;

public class read_write_files {

	public static void main(String[] args) throws IOException {
	    String inputFilename = "src/myStudyApp/test.txt";
	    String eachLine;
	    BufferedReader br = new BufferedReader(new FileReader(inputFilename));
	    
	    File outputFile = new File("result.txt");
	    if (!outputFile.exists()) {
		    outputFile.createNewFile();
		}
	    BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
	    
	    // copy file contents to new file
	    while( (eachLine = br.readLine()) != null){
	      bw.write(eachLine);
	      bw.newLine();
	      System.out.println(eachLine);
	    }
	    br.close();
	    bw.close();
	}
}
