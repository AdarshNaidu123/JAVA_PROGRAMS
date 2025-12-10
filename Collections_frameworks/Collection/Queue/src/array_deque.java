import java.util.*;
public class array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> number=new ArrayDeque<>();
        number.offer(1);
        number.offer(9);
        number.offer(2);
        number.offer(8);
        number.offer(3);
        number.offer(7);
        number.offer(4);
        System.out.println(number);

        number.poll();
        System.out.println(number);

        System.out.println(number.peek());

        number.push(5);
        System.out.println(number);

        number.addFirst(1);
        System.out.println(number);

        number.addLast(6);
        System.out.println(number);

        System.out.println(number.contains(1));

        System.out.println(number.descendingIterator());

        System.out.println(number);

    }
}
