import java.awt.*;
import java.nio.file.*;
import java.util.List;
public class read3 {
    public static void main(String[] args) throws Exception{
       List<String>  data= Files.readAllLines(Paths.get("create.txt"));
       for(String s:data){
        System.out.println(s);
}


    }
}
