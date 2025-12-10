import java.util.*;
public class String_using_array {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY");
        int n=sc.nextInt();
        String[] arr=new String[n];
        System.out.println("enter the values of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();

        }
        //char[] arr={'a','d','a','r','s','h'};

        for(int i=0;i<arr.length;i++){
            System.out.print("MY NAME IS"+i);
            }
        //arr[5]="N";
        //System.out.println(arr);
        }


    }

