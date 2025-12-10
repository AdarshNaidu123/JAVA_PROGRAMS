import java.io.File;
import java.io.FileWriter;
public class write1 {
    public static void main(String[] args) {
        try {
            File obj1 = new File("create.txt");
            obj1.createNewFile();
            System.out.println("file cfreated sucsessfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
        try {
            FileWriter obj = new FileWriter("create.txt");
            obj.write("I created file first and using the same file i mentioned information in that file using file name");
            obj.write("\n now i print that using read");
            obj.close();
            System.out.println("sucsessfully entered text in file");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
