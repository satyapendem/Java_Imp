import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content="Sasi Institute of Technology and Engineering";
		File file= new File("C:\\Harsha\\Harsha.txt");
		boolean boolValue;
		try {
			if(!file.exists())
			{
				boolValue=file.createNewFile();
				System.out.println("Created File: "+ boolValue);
			}
			else
			{
				FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write(content);
				bufferedWriter.close();
				System.out.println("Content Added");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
