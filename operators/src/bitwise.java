import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of a");
        int a=sc.nextInt();
        System.out.println("enter value of b");
        int b=sc.nextInt();

        System.out.println(a&b);//and
        System.out.println(a|b);//or
        System.out.println(a^b);//xor
        System.out.println(~a);//complement
        System.out.println(a<<2);//left shift
        System.out.println(a>>2);//right shift

    }
}
