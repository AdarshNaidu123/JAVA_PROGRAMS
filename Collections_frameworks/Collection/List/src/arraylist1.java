import java.util.*;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer>  num=new ArrayList<>();
        num.addAll(Arrays.asList(12,5,6,79,34,9));
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);

    }
}
