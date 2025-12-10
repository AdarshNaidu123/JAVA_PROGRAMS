import java.io.File;
import java.io.FileOutputStream;
public class write3_image {
    public static void main(String[] args) {
        String content="C:\\Users\\adars\\Downloads\\dog2.webp";

        try(FileOutputStream obj=new FileOutputStream("dog2.webp")){
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
