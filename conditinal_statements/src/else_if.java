import java.util.Scanner;
public class else_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n>=18)
            System.out.println("you are eligible to vote");
        else if(n==17)
            System.out.println("wait one year");
        else
            System.out.println("wait until 18");
    }
}
