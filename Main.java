import java.io.File;
import java.io.FileNotFoundException;

public class Main{
	
	public static void main(String [] args) throws FileNotFoundException {
		private File f = new File("C:\\Users\\Branden\\Desktop\\numbers.txt");
		SumTheNumbers numObject = new SumTheNumbers(f);
		numObject.addNumbers();
		System.out.println(numObject.getSum());
	}
}