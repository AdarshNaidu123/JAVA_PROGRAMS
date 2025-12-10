import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        names.add("Adarsh");
        names.add("Anas");
        names.add("Balaji");
        System.out.println(names);

        names.add(1,"deepaka");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        System.out.println(names.size());

        System.out.println(names.contains("Adarsh"));

        names.set(1,"Yeswanth");
        System.out.println(names);

        names.addFirst("Deepak");
        System.out.println(names);

        names.addLast("Anas");
        System.out.println(names);

        System.out.println(names.isEmpty());


    }
}
