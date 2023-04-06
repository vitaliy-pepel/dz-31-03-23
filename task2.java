import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.*;

public class task2 {
    public static void main(String[] args) {

        ArrayList<Integer> s = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            s.add((int) Math.round((Math.random() * 90) + 10));
        }
        System.out.println(s);

        ArrayList<Integer> new_list = new ArrayList<Integer>();
        for (int j = 0; j < 10; j++) {
            if (s.get(j) % 2 != 0) {
                new_list.add(s.get(j));
            }
        }
        System.out.println(new_list);
    }
}