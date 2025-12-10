import java.io.FileReader;

public class read1 {
    public static void main(String[] args) {
        //FileReader obj=new FileReader("create.txt");
        try(  FileReader obj=new FileReader("file.txt");){
            int data;
            while((data=obj.read())!=-1) {
                char c = (char) data;

                //  char c=(char) data;
                System.out.print(c);
            }
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
