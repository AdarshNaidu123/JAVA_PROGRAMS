import java.util.*;
import java.util.Collections;
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> n=new TreeSet<>();
        n.add(23);
        n.add(2);
        n.add(12);
        n.add(45);
        n.add(1);
        n.add(3);
        System.out.println(n);

        System.out.println(n.contains(2));

        System.out.println(n.ceiling(4));

        System.out.println(n.floor(4));

        System.out.println(n.lower(2));

        System.out.println(n.higher(2));

        n.remove(2);
        System.out.println(n);

        n.clear();
        System.out.println();

        System.out.println(n.isEmpty());
    }
}
