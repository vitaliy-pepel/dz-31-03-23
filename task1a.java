import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.*;

/*Сортировка слиянием*/
public class task1a {
    public static void main(String[] args) {
        Integer[] s = new Integer[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = (int) Math.round((Math.random() * 90) + 10);
        }
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(sort_list(s)));
    }
    public static Integer[] sort_list(Integer[] s) {
        if (s.length == 1) {
            return s;
        }
        int middle = s.length / 2;
        Integer[] left_part = sort_list(Arrays.copyOfRange(s, 0, middle));
        Integer[] right_part = sort_list(Arrays.copyOfRange(s, middle, s.length));
        return mergeArrays(left_part, right_part);
    }
    public static Integer[] mergeArrays(Integer[] a, Integer[] b) {
        Integer[] res = new Integer[a.length + b.length];
        Integer n = a.length;
        Integer m = b.length;
        Integer i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                res[k] = a[i];
                i++; }
            else {
                res[k] = b[j];
                j++; }
            k++; }
        while (i < n) {
            res[k] = a[i];
            i++;
            k++; }
        while (j < m) {
            res[k] = b[j];
            j++;
            k++; }
        return res;
    }
}
