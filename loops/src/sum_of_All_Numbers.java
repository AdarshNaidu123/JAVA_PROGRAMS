import java.util.Scanner;
public class sum_of_All_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.print(i);
             sum=sum+i;

        }
        System.out.println();
        System.out.println(sum);
    }
}
