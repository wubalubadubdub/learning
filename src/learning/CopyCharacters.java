package learning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//this is a little program that copies a text file 
public class CopyCharacters {
	public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;

        try {
        	inputStream = new BufferedReader(new FileReader("C:\\Users\\intensiveporpoises\\Documents\\xanadu.txt"));
        	outputStream = new BufferedWriter(new FileWriter("C:\\Users\\intensiveporpoises\\Documents\\characteroutput.txt"));

            int c ;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally { //we need to make sure streams are closed before program exits so that we won't have resource leaks
            if (inputStream != null) { 
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}
