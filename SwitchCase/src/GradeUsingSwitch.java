import java.util.Scanner;

public class GradeUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int marks = sc.nextInt();
        int a=marks/10;
        switch (a) {
            case 1:
                System.out.println("fail");
                break;
            case 2:
                System.out.println("fail");
                break;
            case 3:
                System.out.println("fail");
                break;
            case 4:
                System.out.println("fail");
                break;
            case 5:
                System.out.println("E");
                break;
            case 6:
                System.out.println("D");
                break;
            case 7:
                System.out.println("C");
                break;
            case 8:
                System.out.println("B");
                break;
            case 9:
                System.out.println("A");
                break;
            case 10:
                System.out.println("out of out");
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }
}
