 package xyz;

import java.io.FileReader;

public class ReadFromFile {
	
	public static void main(String[]args) {
		try {
			FileReader reader = new FileReader("C:\\user\\pallavi\\desktop");
					int ch;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
			reader.close();
		}
		         catch (IOException e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}

	

}
