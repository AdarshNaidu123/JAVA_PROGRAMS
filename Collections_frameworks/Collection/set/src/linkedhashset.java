import java.util.*;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> n=new LinkedHashSet<>();
        n.add(23);
        n.add(2);
        n.add(12);
        n.add(45);
        System.out.println(n);

        System.out.println(n.contains(2));

        n.clear();
        System.out.println();

        System.out.println(n.isEmpty());
    }
}
