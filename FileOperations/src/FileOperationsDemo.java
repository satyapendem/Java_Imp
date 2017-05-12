import java.io.File;
import java.io.IOException;
public class FileOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\User\\Desktop\\Java Programs\\FileOperations\\src\\file.txt");
		boolean bool;
		try {
			if(bool=file.createNewFile())
			{
				System.out.println("Created: "+ bool);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
