
import java.nio.file.Files;
import java.nio.file.Paths;


public class write4 {
    public static void main(String[] args) {
        String content="hello hi";
        try{
            Files.write(Paths.get("create5.txt"), content.getBytes());
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
