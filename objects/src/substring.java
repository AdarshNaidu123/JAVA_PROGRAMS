import java.util.Scanner;
class substringFinder{
    public void findAllSubstring(String str){
        for(int i=0;i<str.length();i++){
            for (int j=i+1;j<str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
public class substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string value");
        String str=sc.nextLine();
        substringFinder s=new substringFinder();
        s.findAllSubstring(str);

    }
}
