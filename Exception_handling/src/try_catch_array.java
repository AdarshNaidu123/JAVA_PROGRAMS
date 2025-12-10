public class try_catch_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
       try {
           System.out.println(arr[5]);
       }
       catch(Exception a){
           System.out.println(a);
       }
    }
}
