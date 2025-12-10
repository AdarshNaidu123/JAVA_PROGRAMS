import java.io.File;
import java.io.FileOutputStream;
public class write2 {
    public static void main(String[] args) {
        String content="hello";

        try(FileOutputStream obj=new FileOutputStream("file.txt")){
            System.out.println("file created sucsessfully");
            byte[] bytes=content.getBytes();
            obj.write(bytes);
            System.out.println("printed Sucsessfully");

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
