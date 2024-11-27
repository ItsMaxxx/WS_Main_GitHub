package RandomStuffToRemember;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderWriterBuilder {
public static String line;
public static String consoleInput;

	public static void main(String[] args) throws IOException {
		
		consoleReaderMethod();
		
		System.exit(0);
	}
	
	public static void writerMethod() throws IOException{
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("BufferedWriter.txt"));
		
		writer.write("Hallo!");
		writer.write("\nNächste Linie.");
		writer.close();
		
	}//end BufferedWriter
	
	public static void readerMethod() throws IOException{
		
		BufferedReader reader = new BufferedReader(new FileReader("BufferedWriter.txt"));
		
		System.out.println(reader.readLine());
		reader.close();
		
	}
	
	public static void consoleReaderMethod() throws IOException{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		consoleInput = reader.readLine();
		
		reader.close();
		
		System.out.println(consoleInput);
	}//end BufferedReader
	
	public static void builderMethod() throws IOException{
		
		StringBuilder bobTheBuilder = new StringBuilder();

		//bobTheBuilder.append();
		
	}//end StringBuilder
	
	
}
