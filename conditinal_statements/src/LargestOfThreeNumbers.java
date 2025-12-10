import java.util.Scanner;

public class LargestOfThreeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        System.out.println("enter value of c");
        int c = sc.nextInt();

        if(a>b&&a>c)
            System.out.println("a is largest="+a);
        else if(b>a&&b>c)
            System.out.println("b is largest="+b);
        else
            System.out.println("c is largest="+c);

    }
}