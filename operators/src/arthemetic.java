import java.util.Scanner;
public class arthemetic {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter value of a");
        int a=sc.nextInt();
        System.out.println("enter value of b");
        int b=sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a++);
        System.out.println(++a);
    }
}
