import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();

        Set<Integer> set = new TreeSet<>();
//
       set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
//
        System.out.println(set);
//
        set.remove(54);
//
        System.out.println(set);
//
        System.out.println(set.contains(21));
//
        System.out.println(set.isEmpty());
//
        System.out.println(set.size());
//
//        set.clear();
//
//       System.out.println(set);

    }
}