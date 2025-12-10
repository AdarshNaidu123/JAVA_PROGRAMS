import java.io.*;

public class ImageCopy {
    public static void main(String[] args) {

        String imagePath ="C:\\Users\\adars\\Downloads\\backiee-290406-landscape.jpg";

        try (
                FileInputStream fis = new FileInputStream(imagePath);
                FileOutputStream fos = new FileOutputStream("backiee-290406-landscape.jpg");
        ) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
