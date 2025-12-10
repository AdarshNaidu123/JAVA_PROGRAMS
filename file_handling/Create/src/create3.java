
import java.nio.file.Files;
import java.nio.file.Paths;


public class create3 {
    public static void main(String[] args) {
        try{
            Files.write(Paths.get("create5.txt"),"hello world".getBytes());
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
