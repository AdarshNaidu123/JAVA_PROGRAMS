import java.util.Scanner;
public class Full_Inverted_LeftAngled_Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j<n;j++) {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
