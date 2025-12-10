import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of i");
        int i=sc.nextInt();
        while (i<=5){
            System.out.println(i);
            i++;
        }
    }
}
