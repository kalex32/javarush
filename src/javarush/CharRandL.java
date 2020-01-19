package javarush;


import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class CharRandL {
    public static Set<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            set.add(random.nextInt(100));
        }
        for (int i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i: removeAllNumberGreaterThan10(set)){
            System.out.print(i + " ");
        }
        return set;
    }

    public static Set<Integer> removeAllNumberGreaterThan10(Set<Integer> set) {
        set.removeIf(i -> i > 30);

        return set;
    }


    public static void main(String[] args) throws IOException {
        createSet();
    }
}