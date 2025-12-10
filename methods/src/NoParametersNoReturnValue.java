import java.util.Scanner;
public class NoParametersNoReturnValue {
    public static void Greet(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        Greet();
    }
}
