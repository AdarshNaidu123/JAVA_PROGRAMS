import java.util.Scanner;
public class Input_Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String str=sc.nextLine();
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Student Name is " + str + " and his age is"+ n);

    }
}
