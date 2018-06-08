import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class SumTheNumbers {
public static void main(String[] args){
    private String currToken;
    private String textString;
    private File f = new File("C:\\Users\\Branden||Desktop\\numbers.txt");
    private BigInteger sum;
    
    
    public SumTheNumbers(File f){
        this.f = f;    
    }
    
    public void addNumbers() throws FileNotFoundException{
        BigInteger total = new BigInteger("0");
        Scanner input = new Scanner(this.f);
        while(input.hasNext()) {
            String numString = input.next();
            BigInteger value = new BigInteger(numString);
            total = total.add(value);
        }
        this.sum = total;
    }
    
    public BigInteger getSum() {
        return this.sum;
    }
    
 }
}