import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
public class read2 {
    public static void main(String[] args) {
        try(FileInputStream obj=new FileInputStream("C:\\Users\\adars\\Downloads\\dog2.webp");
            FileOutputStream obj1=new FileOutputStream("dog2.webp");){
            //byte[] buffer = new byte[1024];
            int data;
                    while((data=obj.read())!=-1) {
                        obj1.write(data);
                        System.out.println(data);
                    }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
