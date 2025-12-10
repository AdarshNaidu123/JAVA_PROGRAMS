
import java.io.File;

public class create1 {
    public static void main(String[] args) {

        try{
            File obj=new File("onetwo.txt");
            if(obj.createNewFile()) {
                System.out.println("created sucssessfully");
            }
            else {
                System.out.println("file not created sucsesssfully");
            }


        }
        catch(Exception e){

            System.out.println(e);

        }
    }
}
