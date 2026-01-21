import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyClass {
  public static void main(String args[]) throws IOException{
    String file;
    file = "";
    exceptionСheckedTest(file);
  } 
  public static void exceptionUncheckedTest() throws ArithmeticException{
    try{
        int divideZeroNum=1/0;
    }
    catch (ArithmeticException e){
        System.out.print("ww");
    }
  }
  public static void exceptionСheckedTest(String filePath) throws IOException { // Declares the exception
        File file = new File(filePath);
        FileReader fr = new FileReader(file);
        fr.close();
   }
}
