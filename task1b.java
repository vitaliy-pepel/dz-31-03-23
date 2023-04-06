import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.*;

/*сортировка выборкой*/
public class task1b {
    public static void main(String[] args) {
        Integer[] s = new Integer[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = (int) Math.round((Math.random() * 90) + 10);
        }
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(sort_list(s)));
    }
    public static Integer[] sort_list(Integer[] s) {
        for (int i = 0; i < s.length; i++) {
            int minimum = i;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j] < s[minimum]){
                    minimum = j;
                }
            }
            int t = s[minimum];
            s[minimum] = s[i];
            s[i] = t;
        }
        return s;
    }
}