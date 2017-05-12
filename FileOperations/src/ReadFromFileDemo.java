import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("C:\\Harsha\\Harsha.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getAbsoluteFile()));
		 String line = null;
		 while ((line = bufferedReader.readLine()) != null) {
		   System.out.println(line);
		 }
	}

}
