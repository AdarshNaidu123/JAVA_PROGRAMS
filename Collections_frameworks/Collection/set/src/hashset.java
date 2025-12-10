import java.util.*;
import java.util.Collections;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> n=new HashSet<>();
        n.add(23);
        n.add(2);
        n.add(12);
        n.add(45);
        System.out.println(n);

        System.out.println(n.contains(2));

        List<Integer> list = new ArrayList<>(n);
        Collections.sort(list);
        System.out.println(list);

        n.clear();
        System.out.println();

        System.out.println(n.isEmpty());
    }
}
