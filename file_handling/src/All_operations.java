import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class All_operations {
    public static void main(String[] args) throws Exception{
       //creating a file
       File obj=new File("AllFile..txt");
        obj.createNewFile();
        System.out.println("file created sucsessfully");
        System.out.println();
        //writing in afile
        FileWriter obj1=new FileWriter("AllFile.txt");
        obj1.write("first created a file\nsecond wrote content in that\nthrid it will read text in file\n then it will delete");
        obj1.close();
        System.out.println("sucsefully written in file");
        System.out.println();
        //Reading a file
        FileReader obj2=new FileReader("AllFile.txt");
        List<String> content= Files.readAllLines(Paths.get("AllFile.txt"));
        for(String s:content){
            System.out.println(s);
        }
        System.out.println();
        //Deleting the file
        obj.delete();
        System.out.println("Deleted sucsessfully");
    }
}
