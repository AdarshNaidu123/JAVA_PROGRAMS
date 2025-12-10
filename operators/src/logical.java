import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        System.out.println(a > 2 && b > 2);//and
        System.out.println(a > 2 || b > 2);//or
        System.out.println(!(a > 2 &&b > 2));//not
    }
}
