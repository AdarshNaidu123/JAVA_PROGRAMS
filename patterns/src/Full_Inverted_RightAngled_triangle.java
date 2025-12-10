import java.util.Scanner;
public class Full_Inverted_RightAngled_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of lines");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
