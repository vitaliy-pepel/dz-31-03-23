import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.*;

public class task3 {
    public static void main(String[] args) {

        ArrayList<Integer> s = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            s.add((int) Math.round((Math.random() * 90) + 10));
        }
        System.out.println(s);
        int sum = s.stream().mapToInt(Integer::intValue).sum();

        System.out.print("max: ");
        System.out.println(Collections.max(s));
        System.out.print("min: ");
        System.out.println(Collections.min(s));
        System.out.print("middle: ");
        System.out.println(sum/s.size());

    }
}