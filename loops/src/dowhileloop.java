import java.util.Scanner;
public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nalue of n");
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=n);

    }
}
