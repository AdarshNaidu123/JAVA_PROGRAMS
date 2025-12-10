import java.util.Scanner;

public class Full_Inverted_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
