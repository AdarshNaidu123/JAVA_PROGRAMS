import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        if(a%2==0)
            System.out.println("even number="+" "+a);
        else
            System.out.println("odd number="+" "+a);

    }
}
