package javarush;

import java.util.ArrayList;

public class CharRandL {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");

        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println();
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add(strings.get(0));
        strings1.add(strings.get(1));
        strings1.add(strings.get(2));

        for (String string : strings1) {
            System.out.println(string);
        }
        System.out.println();
        for(int i = 0; i < strings.size(); i++){
            if(strings.get(i).contains("р") && !strings.get(i).contains("л")) {
                strings1.remove(i);
            }
            if(strings.get(i).contains("л") && !strings.get(i).contains("р")) {
                strings1.add(strings.get(i));
//                i++;
            }
        }
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println();
        return strings1;
    }
}
