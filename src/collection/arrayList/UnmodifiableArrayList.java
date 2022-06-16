package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
        List<String> unmodificable = Collections.unmodifiableList(list);

        System.out.println(list);

        unmodificable.add("h"); // No se puede porque es unmodificable da UnsoportedException

        System.out.println(list);

    }
}
