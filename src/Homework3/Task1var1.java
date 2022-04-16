package Homework3;

import java.util.HashMap;
import java.util.Map;

public class Task1var1 {
    public static void main(String[] args) {
        String[] words =
                {
                        "World", "Peace", "Java", "Exception", "Code",
                        "Table", "Map", "Room", "Door", "Core",
                        "World", "Java", "Room", "File", "Home"
                };


        Map<String, Integer> map = new HashMap<>();


        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);


        System.out.println(map.keySet());
    }
    /*ВЫВОД ПРОГРАММЫ:
    * {Java=2, Table=1, Peace=1, World=2, Code=1, Map=1, Room=2, File=1, Home=1, Exception=1, Door=1, Core=1}
      [Java, Table, Peace, World, Code, Map, Room, File, Home, Exception, Door, Core]*/
}
