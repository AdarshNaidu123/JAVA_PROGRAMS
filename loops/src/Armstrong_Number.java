import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int num=sc.nextInt();
        int r=0;
        int n=num;
        while(num!=0){
            int a=num%10;
            r=r+a*a*a*a;
            num=num/10;

        }
        if(n==r)
            System.out.println(n+ " is a ArmStrong");
        else
            System.out.println(n+ " is not a Armstrong");

    }
}
