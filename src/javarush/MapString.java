package javarush;

import java.util.HashMap;
import java.util.Map;

public class MapString {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Егоров", "Сергей");
        map.put("Коваль", "Алексей");
        map.put("Семашко", "Сергей");
        map.put("Виновий", "Сергей");
        map.put("Винник", "Алексей");
        map.put("Сергеев", "Юрий");
        map.put("Демченко", "Владимир");
        map.put("Заяц", "Виктор");
        map.put("Достоевский", "Федор");
        map.put("Тургенев", "Сергей");

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {

    }

    public static void main(String[] args) {

    }
}
