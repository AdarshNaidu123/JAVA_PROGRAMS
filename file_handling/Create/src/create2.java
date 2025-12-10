import java.io.File;
import java.io.FileOutputStream;
public class create2 {
    public static void main(String[] args) {

        try(FileOutputStream obj=new FileOutputStream("C:\\Users\\adars\\OneDrive\\Desktop\\JFSJD00001\\java1\\file_handling\\Create\\src/create45.jpg")){
            System.out.println("file created sucsessfully");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
