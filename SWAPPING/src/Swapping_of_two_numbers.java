import java.util.Scanner;
public class Swapping_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        int  temp=a;
        a=b;
        b=temp;
        System.out.println("after swaping a=" +a +" b="+b);
    }
}
