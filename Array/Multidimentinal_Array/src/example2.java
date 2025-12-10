import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int m=sc.nextInt();
        int n=sc.nextInt();

        int array[][]=new int[m][n];
        System.out.println("enter the array elements" );
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

              array[i][j]=sc.nextInt();
            }
            System.out.println();

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println();
        }

    }
}
