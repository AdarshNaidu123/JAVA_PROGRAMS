import java.util.Scanner;
public class Number_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enyer the value of n");
        int num=sc.nextInt();
         int count=0;
        while(num!=0) {
            num = num / 10;
            count++;
        }
        System.out.println("count is "+count);
    }
}
