import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        /*if(a>18)
        tem.out.println("enter value of b");
        int b = sc.nextInt();

        if(a>b)
            System.out.println("largest value is="+" "+a);
        else
            System.out.println("largest value is="+ " "+b);*/
        if(a>0)
            System.out.println("postive number");
        else
            System.out.println("negative number");
    }
}

